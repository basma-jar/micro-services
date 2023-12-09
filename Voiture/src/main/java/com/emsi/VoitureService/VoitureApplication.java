package com.emsi.VoitureService;

import com.emsi.VoitureService.Model.Client;
import com.emsi.VoitureService.Model.Voiture;
import com.emsi.VoitureService.Repository.VoitureRepository;
import com.emsi.VoitureService.Service.ClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
@EnableFeignClients
@SpringBootApplication
public class VoitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}

	@Bean
	CommandLineRunner initialiserBaseH2(VoitureRepository voitureRepository, ClientService clientService){

		return args -> {
			Client c1 = clientService.clientById(2L);
			Client c2 = clientService.clientById(1L);
			System.out.println("**************************");
			System.out.println("Id :" + c2);
			System.out.println("**************************");
			System.out.println("**************************");
			System.out.println("Id :" + c1);
			System.out.println("**************************");
			voitureRepository.save(new Voiture(Long.parseLong("1"), "BMW", "A 25 333", "c220", 1L, c2));
			voitureRepository.save(new Voiture(Long.parseLong("2"), "Renault", "B 6 3456", "Megane", 1L, c2));
			voitureRepository.save(new Voiture(Long.parseLong("3"), "Audi", "c 55 4444", "RSq5", 2L, c1));
		};
	}

}
