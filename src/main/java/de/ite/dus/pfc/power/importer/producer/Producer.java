package de.ite.dus.pfc.power.importer.producer;

import de.ite.dus.pfc.power.importer.model.Pfc;

public interface Producer {

    void send(Pfc pfc);
}
