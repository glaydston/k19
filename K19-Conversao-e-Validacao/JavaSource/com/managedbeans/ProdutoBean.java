package com.managedbeans;

import javax.faces.bean.ManagedBean;

import com.model.Produto;

@ManagedBean
public class ProdutoBean {
	private Produto produto = new Produto();

	/**
	 * @return the produto
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * @param produto
	 *            the produto to set
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
