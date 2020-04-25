package com.kafka.producer.libraryeventsproducer.controller;

import com.kafka.producer.libraryeventsproducer.domain.LibraryEvent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** @author a0r00rf */
@RestController
public class LibraryEventsController {

  @PostMapping("/v1/libraryevent")
  public ResponseEntity<LibraryEvent> postLibraryEvent(@RequestBody LibraryEvent libraryEvent) {

    // invoke kafka producer
    return new ResponseEntity<>(libraryEvent, HttpStatus.CREATED);
  }

  @PutMapping("/v1/libraryevent")
  public ResponseEntity<LibraryEvent> putLibraryEvent(@RequestBody LibraryEvent libraryEvent) {

    // invoke kafka producer
    return new ResponseEntity<>(libraryEvent, HttpStatus.OK);
  }
}
