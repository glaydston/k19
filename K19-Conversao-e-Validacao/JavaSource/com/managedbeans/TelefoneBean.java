package com.managedbeans;

import javax.faces.bean.ManagedBean;

import com.model.Telefone;

@ManagedBean
public class TelefoneBean {
	private Telefone telefone;

	/**
	 * @return the telefone
	 */
	public Telefone getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	

}
