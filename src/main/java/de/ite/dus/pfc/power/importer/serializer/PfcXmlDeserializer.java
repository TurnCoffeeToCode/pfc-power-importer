package de.ite.dus.pfc.power.importer.serializer;

import de.ite.dus.pfc.power.importer.generated.HFCEndOfDay;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

@Component
public class PfcXmlDeserializer {

    public HFCEndOfDay deserialize(String xml) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(HFCEndOfDay.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        jaxbUnmarshaller.setEventHandler(new javax.xml.bind.helpers.DefaultValidationEventHandler());
        return (HFCEndOfDay) jaxbUnmarshaller.unmarshal(new StringReader(xml));
    }
}
