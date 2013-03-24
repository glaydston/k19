package model.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.entities.Jogador;
import model.entities.Time;

public class TimeRepository {
	private EntityManager manager;

	public TimeRepository(EntityManager manager) {
		this.manager = manager;
	}

	public void adiciona(Time time) {
		this.manager.persist(time);
	}

	@SuppressWarnings("unchecked")
	public void remove(Long id) {
		Time time = this.procura(id);
		Query query = this.manager.createQuery("select x from Jogador x");
		List<Jogador> jogadores = query.getResultList();
		for (Jogador jogador : jogadores) {
			jogador.setTime(null);
		}
		this.manager.remove(time);
	}

	public Time atualiza(Time time) {
		return this.manager.merge(time);
	}

	public Time procura(Long id) {
		return this.manager.find(Time.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Time> getLista(){
		Query query = this.manager.createQuery("select x from Time x");
		return query.getResultList();
	}

}
