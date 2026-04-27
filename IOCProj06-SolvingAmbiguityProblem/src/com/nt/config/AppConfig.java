//AppConfig.java
package com.nt.config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig:: 0-param constructor");
	}
	
	@Bean(name="ldate")
	//@Primary
	public   LocalDate  createDate() {
		System.out.println("AppConfig.createDate()");
		return LocalDate.now();
	}
	
	@Bean(name="ldate1")
	@Primary
	public   LocalDate  createDate1() {
		System.out.println("AppConfig.createDate1()");
		return LocalDate.of(2020, 10, 20);
	}
	
	@Bean(name="ldate2")
	public   LocalDate  createDate2() {
		System.out.println("AppConfig.createDate3()");
		return LocalDate.of(2025, 10, 20);
	}
	
	@Bean(name="ldate3")
	public   LocalDate  createDate3() {
		System.out.println("AppConfig.createDate3()");
		return LocalDate.of(2030, 11, 20);
	}
	
	
	
	@Bean(name="ltime")
	public    LocalTime  createTime() {
		System.out.println("AppConfig.createTime()");
		return LocalTime.now();
	}

}
