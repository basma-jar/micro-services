package org.EMSI.ClientService;

import org.EMSI.ClientService.Model.Client;
import org.EMSI.ClientService.Repository.clientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
	@Bean
	CommandLineRunner initialiserBaseH2(clientRepository clientRepository) {
		return args -> {
			clientRepository.save(new Client(Long.parseLong("1"), "pers1", Float.parseFloat("20")));
			clientRepository.save(new Client(Long.parseLong("2"), "pers2 ", Float.parseFloat("21")));
			clientRepository.save(new Client(Long.parseLong("3"), "pers3", Float.parseFloat("22")));

		};
	}

}
