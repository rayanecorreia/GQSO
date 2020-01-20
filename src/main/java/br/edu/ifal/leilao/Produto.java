package br.edu.ifal.leilao;

public class Produto {

	private String nome;
	private String descricao;

	public Produto(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
