package com.example.kursspring;

import com.example.kursspring.domain.Castle;
import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.Quest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:config/spring-config.xml")
public class KursspringApplication {

	public static void main(String[] args) {
		/*
		ConfigurableApplicationContext confAppContext = SpringApplication.run(KursspringApplication.class, args);
		Castle castle = (Castle)confAppContext.getBean("castle");
		System.out.println(castle);
		*/
		SpringApplication.run(KursspringApplication.class, args);
	}

}
