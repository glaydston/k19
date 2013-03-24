package com.ibm.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.event.AjaxBehaviorEvent;
import javax.persistence.EntityManager;

import com.ibm.dtos.Jogador;
import com.ibm.dtos.Selecao;
import com.ibm.repository.JogadorRepository;
import com.ibm.repository.SelecaoRepository;

@ManagedBean
public class JogadorBean {

	@ManagedProperty(value = "#{entityManager}")
	private EntityManager entityManager;

	private Jogador jogador = new Jogador();

	private Long selecaoID;

	private List<Jogador> jogadores;

	public void adiciona(AjaxBehaviorEvent event) {
		SelecaoRepository selecaoRepository = new SelecaoRepository(
				this.entityManager);
		Selecao selecao = selecaoRepository.procura(this.selecaoID);
		this.jogador.setSelecao(selecao);
		JogadorRepository repository = new JogadorRepository(this.entityManager);
		repository.adiciona(this.jogador);
		this.jogador = new Jogador();

		// this.jogadores = null;
	}

	public void remove(AjaxBehaviorEvent event) {
		JogadorRepository repository = new JogadorRepository(this.entityManager);
		repository.remove(jogador);
		this.jogadores = null;
	}

	public List<Jogador> getJogadores() {
		if (this.jogadores == null) {
			System.out.println("--->> CHAMANDO O REPOSITORIO <<---");
			JogadorRepository repository = new JogadorRepository(
					this.entityManager);
			this.jogadores = repository.getJogadores();
		}
		return this.jogadores;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public Long getSelecaoID() {
		return selecaoID;
	}

	public void setSelecaoID(Long selecaoID) {
		this.selecaoID = selecaoID;
	}
	
	

}
