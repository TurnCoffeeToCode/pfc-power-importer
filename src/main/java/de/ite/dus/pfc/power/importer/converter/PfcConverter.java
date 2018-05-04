package de.ite.dus.pfc.power.importer.converter;

import de.ite.dus.pfc.power.importer.generated.CalibrationCurveType;
import de.ite.dus.pfc.power.importer.generated.DateWithPricesType;
import de.ite.dus.pfc.power.importer.generated.HFCEndOfDay;
import de.ite.dus.pfc.power.importer.generated.PricePerTimeType;
import de.ite.dus.pfc.power.importer.model.Curve;
import de.ite.dus.pfc.power.importer.model.Pfc;
import de.ite.dus.pfc.power.importer.model.TimedValue;
import de.ite.dus.pfc.power.importer.model.types.Country;
import de.ite.dus.pfc.power.importer.model.types.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PfcConverter {

    @Autowired
    private DateConverter dateConverter;

    public Pfc convert(HFCEndOfDay hfcEndOfDay) {
        Assert.notNull(hfcEndOfDay, "");
        Curve curve = convert(hfcEndOfDay.getCalibrationCurve());
        return new Pfc(curve);
    }

    private Curve convert(CalibrationCurveType calibrationCurve) {
        Assert.notNull(calibrationCurve, "");

        Curve result = new Curve();
        result.setUnit(Unit.EUR_MWH);
        result.setCountry(Country.DE);
        result.setMarketPostfix(calibrationCurve.getMarketPostfix());
        result.setTradeDate(convertLocalDateTime(calibrationCurve.getTradeDate()));
        result.setEetTimeStamp(convertLocalDateTime(calibrationCurve.getEetTimestamp()));

        List<TimedValue> values = convertCurveValues(calibrationCurve.getD());
        result.setValues(values);
        return result;
    }

    private List<TimedValue> convertCurveValues(List<DateWithPricesType> dateWithPrices) {
        return dateWithPrices.stream()
                .map(this::convert)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    private List<TimedValue> convert(DateWithPricesType dateWithPrice) {
        Assert.notNull(dateWithPrice, "");

        LocalDate dayOfPrice = dateConverter.convertLocalDate(dateWithPrice.getD());

        List<PricePerTimeType> pricePerTimes = dateWithPrice.getP();
        List<TimedValue> result = pricePerTimes.stream().map(pricePerTime -> {
            LocalTime timeWithinDay = dateConverter.convertLocalTime(pricePerTime.getT());
            return new TimedValue(LocalDateTime.of(dayOfPrice, timeWithinDay), pricePerTime.getValue());
        }).collect(Collectors.toList());

        return result;
    }

    private LocalDateTime convertLocalDateTime(XMLGregorianCalendar calendar) {
        return dateConverter.convertLocalDateTime(calendar);
    }

}
