package com.example.database_demo.database_demo;

import com.example.database_demo.database_demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.database_demo.database_demo.repo.PersonRepository;

import java.util.Date;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {
	@Autowired
	PersonRepository personRepository;

	public DatabaseDemoApplication (){}

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person p = new Person();
		p.setBirthDate(new Date(1998,8,10));
		p.setName("Anil");
		p.setCreatedDate(new Date());
		p.setLocation("Hyderabad");
		personRepository.insert(p);
		Person p1 = personRepository.getById(1);
		System.out.println(p);

	}
}
