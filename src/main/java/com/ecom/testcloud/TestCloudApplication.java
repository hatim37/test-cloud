package com.ecom.testcloud;

import com.ecom.testcloud.entities.Utilisateur;
import com.ecom.testcloud.repository.UtilisateurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class TestCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCloudApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(UtilisateurRepository utilisateurRepository){
		return args -> {
			List<Utilisateur> customerList = List.of(
					Utilisateur.builder()
							.nom("HassanSQL")
							.email("hassan@gmail.com")
							.build(),
					Utilisateur.builder()
							.nom("Hassan2SQL")
							.email("hassan2@gmail.com")
							.build(),
					Utilisateur.builder()
							.nom("Hassan3SQL")
							.email("hassan3@gmail.com")
							.build(),
					Utilisateur.builder()
							.nom("Hassan5SQL")
							.email("hassan4@gmail.com")
							.build()
			);
			utilisateurRepository.saveAll(customerList);
		};
	}
}
