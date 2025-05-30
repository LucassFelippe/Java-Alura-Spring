package br.com.alura.screenmatch;

import br.com.alura.model.DadosEpisodios;
import br.com.alura.model.DadosSerie;
import br.com.alura.model.DadosTemporadas;
import br.com.alura.principal.Principal;
import br.com.alura.service.ConsumoAPI;
import br.com.alura.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();



	}
}
