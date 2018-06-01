package de.ite.dus.pfc.power.importer.converter;

import de.ite.dus.pfc.power.importer.generated.*;
import de.ite.dus.pfc.power.importer.model.Pfc;
import de.ite.dus.pfc.power.importer.model.types.Country;
import de.ite.dus.pfc.power.importer.model.types.Unit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class PfcConverterTest {

    @InjectMocks
    private PfcConverter sut;

    @Mock(answer = Answers.CALLS_REAL_METHODS)
    private DateConverter dateConverter;

    @Test
    public void convert() {
        HFCEndOfDay hfcEndOfDay = new HFCEndOfDay();
        CalibrationCurveType calibrationCurve = new CalibrationCurveType();
        LocalDateTime eetTimeStamp = LocalDateTime.of(2018, Month.JUNE, 1, 11, 12, 12);
        calibrationCurve.setEetTimestamp(dateConverter.convertXMLGregorianCalendar(eetTimeStamp));
        LocalDateTime tradeDate = LocalDateTime.of(2018, Month.JUNE, 1, 11, 12, 12);
        calibrationCurve.setTradeDate(dateConverter.convertXMLGregorianCalendar(tradeDate));

        DateWithPricesType dateWithPricesType = new DateWithPricesType();
        calibrationCurve.getD().add(dateWithPricesType);

        hfcEndOfDay.setCalibrationCurve(calibrationCurve);

        Pfc result = sut.convert(hfcEndOfDay);

        assertThat(result).isNotNull();

        assertThat(result.getCurve()).isNotNull();
        assertThat(result.getCurve().getUnit()).isEqualTo(Unit.EUR_MWH);
        assertThat(result.getCurve().getCountry()).isEqualTo(Country.DE);
        assertThat(result.getCurve().getEetTimeStamp()).isEqualTo(eetTimeStamp);
        assertThat(result.getCurve().getTradeDate()).isEqualTo(tradeDate);

    }
}