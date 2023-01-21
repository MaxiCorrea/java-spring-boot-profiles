package com.maxicorrea.javaspringprofiles.config;

import java.util.Objects;
import org.springframework.core.env.Environment;

public class DataSource {

  private final String url;
  private final String driver;
  private final String username;
  private final String password;
  
  public DataSource(
      final Environment environment) {
    Objects.requireNonNull(environment);
    this.url = environment.getProperty("spring.datasource.url");
    this.driver = environment.getProperty("spring.datasource.driver-class-name");
    this.username = environment.getProperty("spring.datasource.username");
    this.password = environment.getProperty("spring.datasource.password");
  }
  
  public String getUrl() { return url; }
  public String getDriver() { return driver; }
  public String getUsername() { return username; }
  public String getPassword() { return password; }
  
  @Override
  public String toString() {
    return String.format("%s\n%s\n%s\n%s\n", getUrl(), getDriver() , getUsername(), getPassword());
  }
  
}
