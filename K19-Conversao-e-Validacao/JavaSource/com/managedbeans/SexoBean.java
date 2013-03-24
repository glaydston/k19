package com.managedbeans;

import javax.faces.bean.ManagedBean;

import com.model.Sexo;
@ManagedBean
public class SexoBean {
	private Sexo sexo;

	/**
	 * @return the sexo
	 */
	public Sexo getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
}
