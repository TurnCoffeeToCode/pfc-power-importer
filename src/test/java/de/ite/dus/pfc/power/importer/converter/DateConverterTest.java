package de.ite.dus.pfc.power.importer.converter;

import org.junit.Before;
import org.junit.Test;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class DateConverterTest {

    private DateConverter sut = new DateConverter();

    private XMLGregorianCalendar cal;

    @Before
    public void setUp() throws Exception {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(2018, Calendar.APRIL, 1, 10,11,12);
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        cal = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
    }

    @Test
    public void convertLocalTime() {
        LocalTime result = sut.convertLocalTime(cal);

        LocalTime expectedResult = LocalTime.of(10, 11, 12);
        assertThat(result).isEqualToIgnoringNanos(expectedResult);
    }

    @Test
    public void convertLocalDate() {
        LocalDate result = sut.convertLocalDate(cal);

        LocalDate expectedResult = LocalDate.of(2018, Month.APRIL, 1);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void convertLocalDateTime() {
        LocalDateTime result = sut.convertLocalDateTime(cal);

        LocalDateTime expectedResult = LocalDateTime.of(2018, Month.APRIL, 1, 10, 11, 12);
        assertThat(result).isEqualToIgnoringNanos(expectedResult);
    }
}