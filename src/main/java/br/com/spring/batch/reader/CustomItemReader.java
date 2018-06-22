package br.com.spring.batch.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import br.com.spring.batch.model.Entity;

/**
 * Classe para leitura de informações de entrada
 * @author <a href="mailto:diegosimoncarmona@gmail.com">Diego Carmona</a>
 * 22 de jun de 2018
 */
public class CustomItemReader implements ItemReader<Entity> {

	@Override
	public Entity read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("Leitura");
		Entity e = new Entity();
		e.setNome("Diegão");
		e.setEndereco("Alameda grajau");
		System.out.println("Terminando leitura");
		return e;
	}
}
