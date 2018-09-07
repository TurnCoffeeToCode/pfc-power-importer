# pfc-power-importer
The pfc power importer can ve used to consume a pfc in xml, converting it into a JSON represantion and publishing it via Kafka aftewards.

Make us of [pfc-power-persistor](https://github.com/TurnCoffeeToCode/pfc-power-persistor) in order to perist the published xml into a Mongo db.

## 
You can ran the application executing the main of `PfcPowerPersistorApplication`. By default it will run a services available on `localhost:8082`.

## Provided Rest API
The importer consumes XMLs posted to `/pfc`. If you want to test it, you can use XMLs like [pfc-example](https://github.com/TurnCoffeeToCode/pfc-power-importer/blob/master/pfc-example.xml)

## Kafka Producer
The importer produces the converted XML as JSOn into a Kafka topic. By default this topic is `pfc-power-import`
