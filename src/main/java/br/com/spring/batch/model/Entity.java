package br.com.spring.batch.model;

/**
 * Classe que reperesenta uma entidade qualquer
 * @author <a href="mailto:diegosimoncarmona@gmail.com">Diego Carmona</a>
 * 22 de jun de 2018
 */
public class Entity extends Object {
	
	public Entity() {
		super();
	}

	private String nome;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
