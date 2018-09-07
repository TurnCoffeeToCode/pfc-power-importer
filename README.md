# pfc-power-importer
The pfc-power.importer can be used to consume a pfc in xml, converting it into a JSON represantion and publishing it via Kafka aftewards. Make us of [pfc-power-persistor](https://github.com/TurnCoffeeToCode/pfc-power-persistor) in order to perist the published xml into a Mongo db.

## Run it
You can ran the application with executing the main of `PfcPowerImporterConfiguration`. By default, it will run on `localhost:8081`.

## Provided Rest API
The importer consumes XMLs posted to `/pfc`. If you want to test it, you can use XMLs like [pfc-example.xml](https://github.com/TurnCoffeeToCode/pfc-power-importer/blob/master/pfc-example.xml).

## Kafka Producer
The importer produces the converted XML as JSON into a Kafka topic. By default, this topic is `pfc-power-import`.
