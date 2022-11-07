package com.qualco.qualcoassignment.config;

import java.io.IOException;
import javax.annotation.PostConstruct;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@NoArgsConstructor
public class AppProperties {
  @PostConstruct
  public void doInit() throws IOException {
    System.out.println("It's Running");
  }
}
