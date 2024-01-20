package com.hamza.wkimedia.producer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static java.lang.String.format;
@Slf4j
@RequiredArgsConstructor
@Service
public class WekimediaProducer {

   private final KafkaTemplate<String,String> kafkaTemplate;
   public void sentMessage(String msg){
       log.info(format("Sending message to alibou Topic:: %s", msg));
       kafkaTemplate.send("wikimedia-stream",msg);
   }

}
