# ventus.aura
https://habr.com/ru/post/496182/

1. (cd bin/windows )start zookeeper-server-start.bat c:\kafka\config\zookeeper.properties 
2. start kafka-server-start.bat c:\kafka\config\server.properties 
(В случае ошибок zookeeper-server-stop.bat и kafka-server-stop.bat)

3. kafka-topics.bat --create --bootstrap-server 127.0.0.1:9092 --partitions 1 --replication-factor 1 --topic nero2

Проверка работоспособности
http://localhost:8099/health

сообщение попадет одно в одну group-id consumer
spring.kafka.consumer.group-id=app.2 (для другого )

партиции (разделы) нужны, чтобы гарантировать безопасность данных (при репликах)
партиции распределяются по брокерам, один главный и данные копируются в них с главного