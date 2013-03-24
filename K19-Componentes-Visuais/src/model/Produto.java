package model;

public class Produto {
	private String nome;
	private Double preco;
	private Boolean showPrice;
	
	

	/**
	 * @param nome
	 * @param preco
	 * @param showPrice
	 */
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
		this.showPrice = true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Boolean getShowPrice() {
		return showPrice;
	}

	public void setShowPrice(Boolean showPrice) {
		this.showPrice = showPrice;
	}

}
