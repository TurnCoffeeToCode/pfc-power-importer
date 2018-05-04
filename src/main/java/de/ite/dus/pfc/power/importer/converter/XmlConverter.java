package de.ite.dus.pfc.power.importer.converter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class XmlConverter {

    public String toJson(String xml) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        JsonNode node = xmlMapper.readTree(xml.getBytes());

        ObjectMapper jsonMapper = new ObjectMapper();
        return jsonMapper.writeValueAsString(node);
    }
}
