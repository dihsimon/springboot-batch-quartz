package br.com.spring.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.com.spring.batch.model.Entity;
import br.com.spring.batch.processor.CustomItemProcessor;
import br.com.spring.batch.reader.CustomItemReader;
import br.com.spring.batch.writer.CustomItemWriter;

/**
 * Classe que representa um JOB
 * @author <a href="mailto:diegosimoncarmona@gmail.com">Diego Carmona</a>
 * 22 de jun de 2018
 */
@Configuration
@EnableBatchProcessing
public class BatchConfigJob {
	
	
	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Bean
	public CustomItemReader reader() {
		return new CustomItemReader();
	}

	@Bean
	public CustomItemProcessor process() {
		return new CustomItemProcessor();
	}

	@Bean
	public CustomItemWriter writer() {
		return new CustomItemWriter();
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1")
				.<Entity, Entity>chunk(10)
				.reader(reader())
				.processor(process())
				.writer(writer())
				.build();
	}

	@Bean
	public Job testJob() {
		return jobBuilderFactory.get("testJob").incrementer(new RunIdIncrementer()).flow(step1()).end().build();
	}
}