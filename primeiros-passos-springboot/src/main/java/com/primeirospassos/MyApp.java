package com.primeirospassos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //Para determinar que os ojetos desta classe serão Beans
public class MyApp implements CommandLineRunner{
	
	//E para injetar uma dependencia de outro componente (ou seja, criar o ojbeto calculadora sem utilizar o new) é utilizado a anotação abaixo
	@Autowired
	private Calculadora calculadora;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("O resultado é " + calculadora.somar(2, 7));
	}

}
