package com.felipe.helptech;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.felipe.helptech.domain.Chamado;
import com.felipe.helptech.domain.Cliente;
import com.felipe.helptech.domain.Tecnico;
import com.felipe.helptech.domain.enums.Perfil;
import com.felipe.helptech.domain.enums.Prioridade;
import com.felipe.helptech.domain.enums.Status;
import com.felipe.helptech.repositories.ChamadoRepository;
import com.felipe.helptech.repositories.ClienteRepository;
import com.felipe.helptech.repositories.TecnicoRepository;

@SpringBootApplication
public class HelptechApplication implements CommandLineRunner {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
		

	public static void main(String[] args) {
		SpringApplication.run(HelptechApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Tecnico tec1 = new Tecnico(null,"Validar ceza", "19100000000", "valdiz@email.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "63653203268", "torvalds@email.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA,Status.ANDAMENTO, "Chamado 01","Primeiro chamado", tec1, cli1);
		
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}

}
