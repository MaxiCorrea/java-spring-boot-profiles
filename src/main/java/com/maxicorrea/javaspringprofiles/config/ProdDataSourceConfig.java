package com.maxicorrea.javaspringprofiles.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
@ConfigurationProperties(value = "application-prod.properties")
public class ProdDataSourceConfig extends DataSource implements DataSourceConfig {

  @Autowired
  public ProdDataSourceConfig(
      final Environment environment) {
    super(environment);
  }
  
  @Override
  public void setup() {
    System.out.println("Setting up datasource for PROD environment. ");
    System.out.println(this);
  }

}
