package com.managedbeans;

import javax.faces.bean.ManagedBean;

import com.model.CPF;

@ManagedBean
public class CPFBean {
	private CPF cpf;

	/**
	 * @return the cpf
	 */
	public CPF getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}
	
}
