package de.ite.dus.pfc.power.importer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class TimedValue {

    private LocalDateTime timestamp;
    private BigDecimal value;
}
