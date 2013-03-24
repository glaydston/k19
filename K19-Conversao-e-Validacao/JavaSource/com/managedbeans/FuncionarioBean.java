package com.managedbeans;

import com.model.Funcionario;

public class FuncionarioBean {
	private Funcionario funcionario = new Funcionario();

	/**
	 * @return the funcionario
	 */
	public Funcionario getFuncionario() {
		return funcionario;
	}

	/**
	 * @param funcionario
	 *            the funcionario to set
	 */
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
