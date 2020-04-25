package com.kafka.producer.libraryeventsproducer.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** @author a0r00rf */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LibraryEvent {

  private Integer libraryEventId;
  private Book book;
}
