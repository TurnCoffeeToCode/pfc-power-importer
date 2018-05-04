package de.ite.dus.pfc.power.importer.serializer;

import de.ite.dus.pfc.power.importer.generated.HFCEndOfDay;
import org.junit.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import javax.xml.bind.JAXBException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class PfcXmlDeserializerTest {

    private PfcXmlDeserializer sut = new PfcXmlDeserializer();

    private ResourceLoader resourceLoader = new DefaultResourceLoader();

    @Test
    public void deserialize() throws IOException, JAXBException {
        String xml = getXmlResource("eod.xml");

        HFCEndOfDay result = sut.deserialize(xml);

        assertThat(result).isNotNull();
    }

    private String getXmlResource(String fileName) throws IOException {
        Resource xml = resourceLoader.getResource(fileName);
        return new BufferedReader(new InputStreamReader(xml.getInputStream())).
                lines()
                .collect(Collectors.joining("\n"));
    }
}