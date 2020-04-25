package com.kafka.producer.libraryeventsproducer.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** @author a0r00rf */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

  private Integer bookId;
  private String bookName;
  private String bookAuthor;
}
