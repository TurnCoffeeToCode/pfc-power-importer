package de.ite.dus.pfc.power.importer.model;

import de.ite.dus.pfc.power.importer.model.types.Country;
import de.ite.dus.pfc.power.importer.model.types.Granularity;
import de.ite.dus.pfc.power.importer.model.types.Unit;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Curve {

    private Country country;

    private LocalDateTime eetTimeStamp;

    private LocalDateTime tradeDate;

    private String marketPostfix;

    private Granularity granularity;

    private Unit unit;

    private List<TimedValue> values;

}
