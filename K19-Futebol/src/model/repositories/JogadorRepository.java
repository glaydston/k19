package model.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.entities.Jogador;

public class JogadorRepository {
	private EntityManager manager;

	public JogadorRepository(EntityManager manager) {
		this.manager = manager;
	}

	public void adiciona(Jogador jogador) {
		this.manager.persist(jogador);
	}

	public void remove(Long id) {
		Jogador jogador = this.procura(id);
		this.manager.remove(jogador);
	}

	public Jogador atualiza(Jogador jogador) {
		return this.manager.merge(jogador);
	}

	public Jogador procura(Long id) {
		return this.manager.find(Jogador.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Jogador> getList() {
		Query query = this.manager.createQuery("select x from Jogador x");
		return query.getResultList();
	}

}
