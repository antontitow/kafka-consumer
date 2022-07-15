package ventus.aura.kafkaconsumer.transfer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Deserializer;
import ventus.aura.kafkastarter.Task;

import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 14.07.2022, 20:15
 */
public class TaskDeserializer implements Deserializer<Task> {
  private final ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {}

  @Override
  public Task deserialize(String topic, byte[] data) {
    try {
      if (data == null) {
        return null;
      }
      return objectMapper.readValue(new String(data, StandardCharsets.UTF_8), Task.class);
    } catch (Exception e) {
      throw new SerializationException("Error when deserializing byte[] to MessageDto");
    }
  }

  @Override
  public Task deserialize(String topic, Headers headers, byte[] data) {
    return Deserializer.super.deserialize(topic, headers, data);
  }

  @Override
  public void close() {}
}
