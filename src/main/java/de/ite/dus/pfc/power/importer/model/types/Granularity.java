package de.ite.dus.pfc.power.importer.model.types;

public enum Granularity {

    HOURLY("hourly");

    private String granularity;

    Granularity(String granularity) {
        this.granularity = granularity;
    }
}
