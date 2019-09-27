package com.everis.equipo1examen3configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Equipo1examen3ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Equipo1examen3ConfigServerApplication.class, args);
	}

}
