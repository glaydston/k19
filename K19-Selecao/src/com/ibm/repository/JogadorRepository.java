package com.ibm.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ibm.dtos.Jogador;

public class JogadorRepository {
	private EntityManager entityManager;

	public JogadorRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void adiciona(Jogador jogador) {
		this.entityManager.persist(jogador);
		this.entityManager.flush();
	}

	@SuppressWarnings("unchecked")
	public List<Jogador> getJogadores() {
		Query query = this.entityManager
				.createQuery("SELECT * FROM jogador AS j");
		return query.getResultList();
	}

	public void remove(Jogador jogador) {
		this.entityManager.remove(jogador);
		this.entityManager.flush();

	}

}
