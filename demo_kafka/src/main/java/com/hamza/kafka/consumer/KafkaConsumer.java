package com.hamza.kafka.consumer;

import com.hamza.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;


@Service
@Slf4j
public class KafkaConsumer {
    public void consumeMsg(String msg)
    {
        log.info(format("Consuming the message from alibou Topic:: %s", msg));

    }
    @KafkaListener(topics = "hamza" ,groupId = "myGroup")
    public void consumeJasonMsg(Student student){
        log.info(format("Consuming the message from alibou Topic:: %s",student.toString()));
    }
}
