package com.model;

import java.sql.Date;


public class Funcionario {
	
	private Double salario;
	private Integer codigo;
	private Date aniversario;
	/**
	 * @return the salario
	 */
	public Double getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the aniversario
	 */
	public Date getAniversario() {
		return aniversario;
	}
	/**
	 * @param aniversario the aniversario to set
	 */
	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	
	
	

}
