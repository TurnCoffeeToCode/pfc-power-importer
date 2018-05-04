package de.ite.dus.pfc.power.importer.controller;

import de.ite.dus.pfc.power.importer.converter.PfcConverter;
import de.ite.dus.pfc.power.importer.generated.HFCEndOfDay;
import de.ite.dus.pfc.power.importer.model.Pfc;
import de.ite.dus.pfc.power.importer.producer.Producer;
import de.ite.dus.pfc.power.importer.serializer.JsonSerializer;
import de.ite.dus.pfc.power.importer.serializer.PfcXmlDeserializer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import java.io.IOException;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Slf4j
@RestController
public class PfcController {

    @Autowired
    private Producer producer;

    @Autowired
    private PfcConverter pfcConverter;

    @Autowired
    private JsonSerializer jsonSerializer;

    @Autowired
    private PfcXmlDeserializer pfcXmlDeserializer;

    @RequestMapping(value = "/pfc", method = POST, consumes = APPLICATION_JSON_VALUE)
    public HttpStatus importPfc(@RequestBody String message) {
        if(StringUtils.isEmpty(message)) {
            return BAD_REQUEST;
        }

        try {
            HFCEndOfDay hFCEndOfDay = pfcXmlDeserializer.deserialize(message);

            Pfc pfc = pfcConverter.convert(hFCEndOfDay);

            String pfcJsonString = jsonSerializer.serialize(pfc);
            producer.send(pfcJsonString);

            return HttpStatus.OK;
        } catch (JAXBException | IOException e) {
            log.error("Error while importing PFC", e);
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }
}
