package com.springbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
	
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Livro livro = factory.getBean(Livro.class);
		livro.setNome("Percy Jackson");
		livro.setCodigo("D37FD");
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("Rick Riordan");
		
		livro.exibir();
		
		((AbstractApplicationContext) factory).close();
	}

}
