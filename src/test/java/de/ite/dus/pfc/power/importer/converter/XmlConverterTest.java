package de.ite.dus.pfc.power.importer.converter;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class XmlConverterTest {

    private XmlConverter sut = new XmlConverter();

    @Test
    public void toJson() throws IOException {
        String xml = "<outer><inner>Hello World</inner></outer>";

        String result = sut.toJson(xml);

        assertThat(result).isEqualTo("{\"inner\":\"Hello World\"}");

    }
}