package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// record => automatically created class, getter, setter, toString method and no need to created manually
record Person (String name, int age) {};

record Address (String firstLine, String city) {};


@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Pearl";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Mary", 24);
		System.out.println(person.age());
		return person;
	}
	
	@Bean
	public Address address() {
		var address = new Address("Woodleigh Street", "Singapore");
		return address;
	}
	
}
