package com.udsu.edu;

import com.udsu.edu.entity.Person;
import com.udsu.edu.repository.PersonRepository;
import com.udsu.edu.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

public static void main(String[] args) {
	SpringApplication.run(DemoApplication.class, args);
}

}
//curl -X POST --data 'aaa' http://localhost:8080/save