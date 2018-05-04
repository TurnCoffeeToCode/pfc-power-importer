package de.ite.dus.pfc.power.importer.converter;

import org.springframework.stereotype.Component;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
public class DateConverter {

    public LocalTime convertLocalTime(XMLGregorianCalendar cal) {
        return cal.toGregorianCalendar().toZonedDateTime().toLocalTime();
    }

    public LocalDate convertLocalDate(XMLGregorianCalendar cal) {
        return cal.toGregorianCalendar().toZonedDateTime().toLocalDate();
    }

    public LocalDateTime convertLocalDateTime(XMLGregorianCalendar cal) {
        return cal.toGregorianCalendar().toZonedDateTime().toLocalDateTime();
    }
}
