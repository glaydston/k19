/**
 * 
 */
package com.managedbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import com.model.Carro;

/**
 * @author glaydston
 * 
 */
@ManagedBean
public class CarroBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Carro> carros = new ArrayList<Carro>();
	private Carro carro = new Carro();

	public void adicionaCarro(ActionEvent event) {
		this.carros.add(this.carro);
		this.carro = new Carro();
	}

	/**
	 * @return the carro
	 */
	public Carro getCarro() {
		return carro;
	}

	/**
	 * @param carro
	 *            the carro to set
	 */
	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	/**
	 * @return the carros
	 */
	public List<Carro> getCarros() {
		return carros;
	}

	/**
	 * @param carros
	 *            the carros to set
	 */
	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

}
