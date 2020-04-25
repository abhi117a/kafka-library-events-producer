package com.kafka.producer.libraryeventsproducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/** @author a0r00rf */
@Configuration
public class AutoCreateConfig {

  @Bean
  public NewTopic libraryEvents() {

    return TopicBuilder.name("library-events").partitions(3).replicas(3).build();
  }
}
