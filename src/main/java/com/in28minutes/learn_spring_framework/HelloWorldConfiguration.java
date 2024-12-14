package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


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
	public Person person2MethodCall() {
		return new Person(name(), age()); // reuse the existing bean which is name and age
	}
	
	@Bean
	@Primary
	public Person person3Parameters(String name, int age, Address address) { // inject Bean as a parameter
		return new Person(name, age); 
	}
	
	
	
	// creating customename
	@Bean(name="address2")
	@Primary
	public Address address() {
		var address = new Address("Topayo Street", "Singapore");
		return address;
	}
	
	
	@Bean(name="address3")
	public Address address3() {
		var address = new Address("Choa Chu Kang Street", "Singapore");
		return address;
	}
	
	
	
}
