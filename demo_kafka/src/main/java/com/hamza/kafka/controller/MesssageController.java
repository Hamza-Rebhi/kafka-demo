package com.hamza.kafka.controller;

import com.hamza.kafka.payload.Student;
import com.hamza.kafka.producer.KafkaJsonProducer;
import com.hamza.kafka.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MesssageController {
  private final KafkaProducer kafkaProducer;
  private final KafkaJsonProducer kafkaJsonProducer;

  @PostMapping
  public ResponseEntity<String> sendMessage(
          @RequestBody String message
  ) {
    kafkaProducer.sendMessage(message);
    return ResponseEntity.ok("Message queued successfully");
  }

  @PostMapping("/json")
  public ResponseEntity<String> sendJsonMessage(
          @RequestBody Student message
  ) {
    kafkaJsonProducer.sendMessage(message);
    return ResponseEntity.ok("Message queued successfully as JSON");
  }
}
