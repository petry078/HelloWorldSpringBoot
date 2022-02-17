package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pingg")
public class ControllerHello {
	
	@GetMapping
	public String hello()
	{
		return "Hello, World!\n"
				+ "\n"
				+ "Estas são algumas das mentalidades que estou aprendendo no bootcamp da Generation Brasil:\n"
				+ "\n"
				+ "* Coordenar e se comunicar com sua equipe e clientes;\n"
				+ "* Identificar quando pedir ajuda e quais recursos utilizar;\n"
				+ "* Aprender a aprender;\n"
				+ "* Aprender a ensinar;\n"
				+ "* Mentalidade de crescimento;\n"
				+ "* Orientação ao futuro;\n"
				+ "* Persistência;\n"
				+ "* Responsabilidade pessoal;\n"
				+ "* Orientação ao detalhe;\n"
				+ "* Trabalho em equipe;\n"
				+ "* Proatividade;\n"
				+ "* Comunicação.\n"
				+ "\n"
				+ "See you, space cowboy!";
	}

}
 