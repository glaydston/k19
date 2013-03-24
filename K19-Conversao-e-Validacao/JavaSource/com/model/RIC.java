package com.model;

public class RIC {
	private String numeroDeIdentificacao;
	private String digitoVerificador;

	/**
	 * 
	 */
	public RIC() {
	}

	/**
	 * @param numeroDeIdentificacao
	 * @param digitoVerificador
	 */
	public RIC(String numeroDeIdentificacao, String digitoVerificador) {
		this.numeroDeIdentificacao = numeroDeIdentificacao;
		this.digitoVerificador = digitoVerificador;
	}

	/**
	 * @return the numeroDeIdentificacao
	 */
	public String getNumeroDeIdentificacao() {
		return numeroDeIdentificacao;
	}

	/**
	 * @param numeroDeIdentificacao
	 *            the numeroDeIdentificacao to set
	 */
	public void setNumeroDeIdentificacao(String numeroDeIdentificacao) {
		this.numeroDeIdentificacao = numeroDeIdentificacao;
	}

	/**
	 * @return the digitoVerificador
	 */
	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	/**
	 * @param digitoVerificador
	 *            the digitoVerificador to set
	 */
	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

}
