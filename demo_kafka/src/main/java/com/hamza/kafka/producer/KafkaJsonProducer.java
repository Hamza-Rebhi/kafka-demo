package com.hamza.kafka.producer;

import com.hamza.kafka.payload.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.messaging.support.MessageBuilder;

@Service
@RequiredArgsConstructor
public class KafkaJsonProducer {
    private final KafkaTemplate<String , Student> KafkaTemplate;
    public void sendMessage(Student student) {

        Message<Student> message = MessageBuilder.withPayload(student)
                .setHeader(KafkaHeaders.TOPIC,"hamza")
                .build();
        KafkaTemplate.send(message);}
}
