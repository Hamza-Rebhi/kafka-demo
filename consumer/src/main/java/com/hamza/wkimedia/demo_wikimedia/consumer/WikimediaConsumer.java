package com.hamza.wkimedia.demo_wikimedia.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Slf4j
@Service
public class WikimediaConsumer {
    @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")

    public void consumeWikimediaMsg(String msg) {
        log.info(format("Consuming the message from alibou Topic:: %s", msg));

    }
}