package com.ibm.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.event.AjaxBehaviorEvent;
import javax.persistence.EntityManager;

import com.ibm.dtos.Selecao;
import com.ibm.repository.SelecaoRepository;

@ManagedBean
public class SelecaoBean {

	@ManagedProperty(value = "#{entityManager}")
	private EntityManager entityManager;

	private Selecao selecao = new Selecao();

	private List<Selecao> selecoes;

	public void adiciona(AjaxBehaviorEvent event) {
		SelecaoRepository repository = new SelecaoRepository(this.entityManager);
		repository.adiciona(selecao);
		this.selecao = new Selecao();
	}

	public List<Selecao> getSelecoes() {
		if (this.selecoes == null) {
			System.out.println("--->> CHAMANDO O REPOSITORIO <<---");
			SelecaoRepository repository = new SelecaoRepository(
					this.entityManager);
			this.selecoes = repository.getSelecoes();
		}
		return this.selecoes;
	}

	public void remove(AjaxBehaviorEvent event) {
		SelecaoRepository repository = new SelecaoRepository(this.entityManager);
		repository.remove(selecao);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Selecao getSelecao() {
		return selecao;
	}

	public void setSelecao(Selecao selecao) {
		this.selecao = selecao;
	}

	public void setSelecoes(List<Selecao> selecoes) {
		this.selecoes = selecoes;
	}
	
	

}
