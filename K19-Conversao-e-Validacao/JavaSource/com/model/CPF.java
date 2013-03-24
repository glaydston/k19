package com.model;

public class CPF {
	private Integer numeroDeIdentificacao;
	private Integer primeiroDigitoVerificador;
	private Integer segundoDigitoVerificador;

	/**
	 * @return the numeroDeIdentificacao
	 */
	public Integer getNumeroDeIdentificacao() {
		return numeroDeIdentificacao;
	}

	/**
	 * @param numeroDeIdentificacao
	 *            the numeroDeIdentificacao to set
	 */
	public void setNumeroDeIdentificacao(Integer numeroDeIdentificacao) {
		this.numeroDeIdentificacao = numeroDeIdentificacao;
	}

	/**
	 * @return the primeiroDigitoVerificador
	 */
	public Integer getPrimeiroDigitoVerificador() {
		return primeiroDigitoVerificador;
	}

	/**
	 * @param primeiroDigitoVerificador
	 *            the primeiroDigitoVerificador to set
	 */
	public void setPrimeiroDigitoVerificador(Integer primeiroDigitoVerificador) {
		this.primeiroDigitoVerificador = primeiroDigitoVerificador;
	}

	/**
	 * @return the segundoDigitoVerificador
	 */
	public Integer getSegundoDigitoVerificador() {
		return segundoDigitoVerificador;
	}

	/**
	 * @param segundoDigitoVerificador
	 *            the segundoDigitoVerificador to set
	 */
	public void setSegundoDigitoVerificador(Integer segundoDigitoVerificador) {
		this.segundoDigitoVerificador = segundoDigitoVerificador;
	}
	
	

	/**
	 * 
	 */
	public CPF() {
	}

	/**
	 * @param numeroDeIdentificacao
	 * @param primeiroDigitoVerificador
	 * @param segundoDigitoVerificador
	 */
	public CPF(Integer numeroDeIdentificacao,
			Integer primeiroDigitoVerificador, Integer segundoDigitoVerificador) {
		this.numeroDeIdentificacao = numeroDeIdentificacao;
		this.primeiroDigitoVerificador = primeiroDigitoVerificador;
		this.segundoDigitoVerificador = segundoDigitoVerificador;
	}

}
