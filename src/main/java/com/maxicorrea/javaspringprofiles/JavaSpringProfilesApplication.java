package com.maxicorrea.javaspringprofiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.maxicorrea.javaspringprofiles.config.DataSourceConfig;

@SpringBootApplication
public class JavaSpringProfilesApplication {
  
  @Autowired
  private DataSourceConfig dataSourceConfig;
   
  public static void main(String[] args) {
    SpringApplication.run(JavaSpringProfilesApplication.class, args);
  }
  
  @Bean
  public void setupDataSource() {
    dataSourceConfig.setup();
  }
}
