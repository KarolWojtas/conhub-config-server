package com.karol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableConfigServer
@SpringBootApplication
@EnableDiscoveryClient
public class ConhubConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConhubConfigServerApplication.class, args);
	}
}
