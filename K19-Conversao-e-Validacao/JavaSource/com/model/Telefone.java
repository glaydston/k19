package com.model;

public class Telefone {
	private String codigoDoPais;
	private String codigoDeArea;
	private String numeroLocal;

	/**
	 * 
	 */
	public Telefone() {
	}

	/**
	 * @param codigoDoPais
	 * @param codigoDeArea
	 * @param numeroLocal
	 */
	public Telefone(String codigoDoPais, String codigoDeArea, String numeroLocal) {
		this.codigoDoPais = codigoDoPais;
		this.codigoDeArea = codigoDeArea;
		this.numeroLocal = numeroLocal;
	}

	/**
	 * @return the codigoDoPais
	 */
	public String getCodigoDoPais() {
		return codigoDoPais;
	}

	/**
	 * @param codigoDoPais
	 *            the codigoDoPais to set
	 */
	public void setCodigoDoPais(String codigoDoPais) {
		this.codigoDoPais = codigoDoPais;
	}

	/**
	 * @return the codigoDeArea
	 */
	public String getCodigoDeArea() {
		return codigoDeArea;
	}

	/**
	 * @param codigoDeArea
	 *            the codigoDeArea to set
	 */
	public void setCodigoDeArea(String codigoDeArea) {
		this.codigoDeArea = codigoDeArea;
	}

	/**
	 * @return the numeroLocal
	 */
	public String getNumeroLocal() {
		return numeroLocal;
	}

	/**
	 * @param numeroLocal
	 *            the numeroLocal to set
	 */
	public void setNumeroLocal(String numeroLocal) {
		this.numeroLocal = numeroLocal;
	}

}
