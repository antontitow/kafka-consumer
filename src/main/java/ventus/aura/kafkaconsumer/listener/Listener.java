package ventus.aura.kafkaconsumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import ventus.aura.kafkastarter.Task;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 12.07.2022, 1:15
 */
@Component
@Slf4j
@EnableKafka
public class Listener {
  @KafkaListener(topics = "${ventus.kafka.topic.name}")
  public void msgListener2(@Payload(required = false) Task msg) {

    log.info(msg.getExecutor());
    log.info(msg.getTitle());
  }
}
