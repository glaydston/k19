package com.model;

import java.sql.Date;

public class Cotacao {
	private Double valor;
	private Double variacao;
	private Date horario;

	/**
	 * @return the valor
	 */
	public Double getValor() {
		return valor;
	}

	/**
	 * @param valor
	 *            the valor to set
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}

	/**
	 * @return the variacao
	 */
	public Double getVariacao() {
		return variacao;
	}

	/**
	 * @param variacao
	 *            the variacao to set
	 */
	public void setVariacao(Double variacao) {
		this.variacao = variacao;
	}

	/**
	 * @return the horario
	 */
	public Date getHorario() {
		return horario;
	}

	/**
	 * @param horario
	 *            the horario to set
	 */
	public void setHorario(Date horario) {
		this.horario = horario;
	}

}
