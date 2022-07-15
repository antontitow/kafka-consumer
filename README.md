# ventus.aura
https://habr.com/ru/post/496182/

1. start zookeeper-server-start.bat c:\kafka\config\zookeeper.properties 
2. start kafka-server-start.bat c:\kafka\config\server.properties 
(В случае ошибок zookeeper-server-stop.bat и kafka-server-stop.bat)

3. kafka-topics.bat --create --bootstrap-server 127.0.0.1:9092 --partitions 1 --replication-factor 1 --topic nero2

Проверка работоспособности
http://localhost:8099/health