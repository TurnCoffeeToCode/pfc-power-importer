package de.ite.dus.pfc.power.importer;

import de.ite.dus.pfc.power.importer.model.Pfc;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class PfcPowerImporterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PfcPowerImporterApplication.class, args);
	}
}
