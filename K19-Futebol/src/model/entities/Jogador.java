package model.entities;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Jogador {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String posicao;
	private Calendar dataNascimento = new GregorianCalendar();
	@ManyToOne
	private Time time;

	/**
	 * 
	 */
	public Jogador() {
	}

	/**
	 * @param id
	 * @param nome
	 * @param posicao
	 * @param dataNascimento
	 * @param time
	 */
	public Jogador(Long id, String nome, String posicao,
			Calendar dataNascimento, Time time) {
		this.id = id;
		this.nome = nome;
		this.posicao = posicao;
		this.dataNascimento = dataNascimento;
		this.time = time;
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
	 * @return the posicao
	 */
	public String getPosicao() {
		return posicao;
	}

	/**
	 * @param posicao
	 *            the posicao to set
	 */
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	/**
	 * @return the dataNascimento
	 */
	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento
	 *            the dataNascimento to set
	 */
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the time
	 */
	public Time getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(Time time) {
		this.time = time;
	}

}
