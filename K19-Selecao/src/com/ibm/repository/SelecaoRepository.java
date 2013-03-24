/**
 * 
 */
package com.ibm.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ibm.dtos.Jogador;
import com.ibm.dtos.Selecao;

/**
 * @author glaydston
 * 
 */
public class SelecaoRepository {
	private EntityManager entityManager;

	public SelecaoRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void adiciona(Selecao selecao) {
		this.entityManager.persist(selecao);
		this.entityManager.flush();
	}

	@SuppressWarnings("unchecked")
	public void remove(Selecao selecao) {
		this.entityManager.remove(selecao);
		Query query = this.entityManager
				.createQuery("SELECT * FROM jogador as j WHERE j.selecao = :selecao");
		query.setParameter("selecao", selecao);

		List<Jogador> jogadores = query.getResultList();
		for (Jogador jogador : jogadores) {
			this.entityManager.remove(jogador);
		}
		this.entityManager.flush();
	}

	@SuppressWarnings("unchecked")
	public List<Selecao> getSelecoes() {
		Query query = this.entityManager
				.createQuery("SELECT * FROM selecao AS s");
		return query.getResultList();
	}

	public Selecao procura(Long id) {
		return this.entityManager.find(Selecao.class, id);
	}

}
