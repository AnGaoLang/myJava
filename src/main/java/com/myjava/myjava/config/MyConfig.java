package com.myjava.myjava.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource(value = "classpath:config.properties")
@ConfigurationProperties(prefix = "my-config")
public class MyConfig {
    private String name;
    private int age;
    private int number;
    private String uuid;
    private int max;
    private String value;
    private String greeting;

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getNumber() { return number; }
    public String getUuid() { return uuid; }
    public int getMax() { return max; }
    public String getValue() { return value; }
    public String getGreeting() { return greeting; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setNumber(int number) { this.number = number; }
    public void setUuid(String uuid) { this.uuid = uuid; }
    public void setMax(int max) { this.max = max; }
    public void setValue(String value) { this.value = value; }
    public void setGreeting(String greeting) { this.greeting = greeting; }
}
