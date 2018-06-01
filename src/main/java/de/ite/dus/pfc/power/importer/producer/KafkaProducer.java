package de.ite.dus.pfc.power.importer.producer;

import de.ite.dus.pfc.power.importer.model.Pfc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaProducer implements Producer {

    @Value("${kafka.topic}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, Pfc> kafkaTemplate;

    public void send(Pfc pfc) {
        log.info("sending payload='{}' to topic='{}'", pfc, topic);
        kafkaTemplate.send(topic, pfc);
    }
}
