package br.com.alura.contador.contador;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Tarefa tarefa = new Tarefa("Lucas", false, "Nova tarefa teste criada");
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("tarefa.json"), tarefa);
		System.out.println("Dados salvos no arquivo tarefa.json");
		Tarefa tarefaLida = mapper.readValue(new File("tarefa.json"), Tarefa.class);
		System.out.println(tarefaLida);



	}
}
