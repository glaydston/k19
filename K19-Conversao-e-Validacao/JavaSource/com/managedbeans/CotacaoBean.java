package com.managedbeans;

import javax.faces.bean.ManagedBean;

import com.model.Cotacao;
@ManagedBean
public class CotacaoBean {
	private Cotacao cotacao = new Cotacao();

	/**
	 * @return the cotacao
	 */
	public Cotacao getCotacao() {
		return cotacao;
	}

	/**
	 * @param cotacao
	 *            the cotacao to set
	 */
	public void setCotacao(Cotacao cotacao) {
		this.cotacao = cotacao;
	}

}
