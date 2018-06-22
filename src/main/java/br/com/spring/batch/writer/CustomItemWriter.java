package br.com.spring.batch.writer;

import java.util.List;
import org.springframework.batch.item.ItemWriter;
import br.com.spring.batch.model.Entity;

/**
 * Classe para gravação, manipular dados para gravar
 * @author <a href="mailto:diegosimoncarmona@gmail.com">Diego Carmona</a> 
 * 22 de jun de 2018
 */
public class CustomItemWriter implements ItemWriter<Entity> {

	@Override
	public void write(List<? extends Entity> items) throws Exception {

		for (Entity e : items) {
			System.out.println("Gravando");
			System.out.println("nome: " + e.getNome());
		}
	}
}
