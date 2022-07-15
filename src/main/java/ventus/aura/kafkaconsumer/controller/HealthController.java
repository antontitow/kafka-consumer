package ventus.aura.kafkaconsumer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 14.07.2022, 17:04
 */
@RestController
@RequestMapping("")
public class HealthController {

  @GetMapping("health")
  public ResponseEntity sendTask() {
    return ResponseEntity.status(HttpStatus.OK).build();
  }
}
