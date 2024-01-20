package com.hamza.wkimedia.producer.controller;

import com.hamza.wkimedia.producer.stream.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/wikimedia")
@RequiredArgsConstructor
public class ProducerController {
    private final WikimediaStreamConsumer wikimediaStreamConsumer;
    @GetMapping
    public void startPublishing(){
        this.wikimediaStreamConsumer.consumeStreamAndPublish();

    }
}
