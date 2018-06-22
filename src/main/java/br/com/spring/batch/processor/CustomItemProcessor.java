package br.com.spring.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import br.com.spring.batch.model.Entity;

/**
 * Classe que representa um processor, processa os itens, Regra do negócio
 * @author <a href="mailto:diegosimoncarmona@gmail.com">Diego Carmona</a>
 * 22 de jun de 2018
 */
public class CustomItemProcessor implements ItemProcessor<Entity, Entity> {

	@Override
	public Entity process(Entity item) throws Exception {
	
		System.out.println("Processor");
		System.out.println("Mudando o nome");
		item.setNome("Diego carmona");
		System.out.println("Fim processor");
		return item;
	}
}
