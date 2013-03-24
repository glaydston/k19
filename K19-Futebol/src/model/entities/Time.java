package model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Time {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String tecnico;

	/**
	 * 
	 */
	public Time() {
	}

	/**
	 * @param id
	 * @param nome
	 * @param tecnico
	 */
	public Time(Long id, String nome, String tecnico) {
		this.id = id;
		this.nome = nome;
		this.tecnico = tecnico;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the tecnico
	 */
	public String getTecnico() {
		return tecnico;
	}

	/**
	 * @param tecnico
	 *            the tecnico to set
	 */
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

}
