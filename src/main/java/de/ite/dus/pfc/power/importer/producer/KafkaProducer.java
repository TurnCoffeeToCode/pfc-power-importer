package de.ite.dus.pfc.power.importer.producer;

import de.ite.dus.pfc.power.importer.model.Pfc;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaProducer implements Producer {

    @Value("${kafka.topic.pfc.power.import}")
    private String topic;

    @Autowired
    private org.apache.kafka.clients.producer.Producer producer;

    public void send(Pfc pfc) {
        log.info("sending payload='{}' to topic='{}'", pfc, topic);
        producer.send(new ProducerRecord<>(topic, pfc));
    }
}
