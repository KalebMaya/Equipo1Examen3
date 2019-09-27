package com.everis.equipo1examen3enviarnotificaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class Equipo1examen3EnviarNotificacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Equipo1examen3EnviarNotificacionesApplication.class, args);
	}

}
