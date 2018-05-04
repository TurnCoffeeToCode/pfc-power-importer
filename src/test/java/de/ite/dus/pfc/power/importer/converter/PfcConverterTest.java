package de.ite.dus.pfc.power.importer.converter;

import de.ite.dus.pfc.power.importer.generated.CalibrationCurveType;
import de.ite.dus.pfc.power.importer.generated.DateWithPricesType;
import de.ite.dus.pfc.power.importer.generated.HFCEndOfDay;
import de.ite.dus.pfc.power.importer.model.Pfc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class PfcConverterTest {

    @InjectMocks
    private PfcConverter sut;

    @Test
    public void convert() {
        HFCEndOfDay hfcEndOfDay = new HFCEndOfDay();
        CalibrationCurveType calibrationCurve = new CalibrationCurveType();
        DateWithPricesType dateWithPricesType = new DateWithPricesType();
        calibrationCurve.getD().add(dateWithPricesType);
        hfcEndOfDay.setCalibrationCurve(calibrationCurve);

        Pfc result = sut.convert(hfcEndOfDay);

        assertThat(result).isNotNull();
    }
}