package de.ite.dus.pfc.power.importer.controller;

import de.ite.dus.pfc.power.importer.converter.XmlConverter;
import de.ite.dus.pfc.power.importer.producer.Producer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Slf4j
@RestController
public class PfcController {

    private Producer producer;

    private XmlConverter xmlConverter;

    public PfcController(Producer producer, XmlConverter xmlConverter) {
        this.producer = producer;
        this.xmlConverter = xmlConverter;
    }

    @RequestMapping(value = "/pfc", method = POST, consumes = APPLICATION_JSON_VALUE)
    public HttpStatus importPfc(@RequestBody String message) {
        if(StringUtils.isEmpty(message)) {
            return BAD_REQUEST;
        }

        try {
            xmlConverter.toJson(message);
            producer.send(message);
        } catch (IOException e) {
            log.error("Error", e);
        }

        return OK;
    }
}
