package com.desafio2.desafio02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Desafio02Application {

	public static void main(String[] args) {
		SpringApplication.run(Desafio02Application.class, args);

	}


	static class Desafio02{

		private String valor01 = "Ibyte";

		private String valor02 = "Goldentec";

	}

}
