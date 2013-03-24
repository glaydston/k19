package managedbeans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;

import model.entities.Jogador;
import model.entities.Time;
import model.repositories.JogadorRepository;
import model.repositories.TimeRepository;

@ManagedBean(name = "jogadorBean")
public class JogadorBean {
	private Jogador jogador = new Jogador();
	private Long timeID;
	private List<Jogador> jogadores = new ArrayList<Jogador>();

	public void adiciona(AjaxBehaviorEvent event ) {
		EntityManager manager = this.getManager();
		TimeRepository timeRepository = new TimeRepository(manager);
		JogadorRepository jogadorRepository = new JogadorRepository(manager);

		if (this.timeID != null) {
			Time time = timeRepository.procura(this.timeID);
			this.jogador.setTime(time);
		}

		if (this.jogador.getId() == null)
			jogadorRepository.adiciona(jogador);
		else
			jogadorRepository.atualiza(jogador);
		this.jogador = new Jogador();
		this.jogador = null;
	}

	public void preparaAlteracao(AjaxBehaviorEvent event ) {
		Long id = getId();
		EntityManager manager = getManager();
		JogadorRepository repository = new JogadorRepository(manager);
		this.jogador = repository.procura(id);
	}

	public void remove(AjaxBehaviorEvent event) {
		Long id = getId();
		EntityManager manager = getManager();
		JogadorRepository repository = new JogadorRepository(manager);
		repository.remove(id);
		this.jogador = null;
	}

	public List<Jogador> getJogadores() {
		if (this.jogadores == null) {
			EntityManager manager = getManager();
			JogadorRepository repository = new JogadorRepository(manager);
			this.jogadores = repository.getList();
		}
		return this.jogadores;
	}

	private EntityManager getManager() {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpServletRequest request = (HttpServletRequest) ec.getRequest();

		return (EntityManager) request.getAttribute("EntityManager");
	}

	private Long getId() {
		Map<String, String> params = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap();
		return Long.parseLong(params.get("id"));
	}

	/**
	 * @return the jogador
	 */
	public Jogador getJogador() {
		return jogador;
	}

	/**
	 * @param jogador
	 *            the jogador to set
	 */
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	/**
	 * @return the timeID
	 */
	public Long getTimeID() {
		return timeID;
	}

	/**
	 * @param timeID
	 *            the timeID to set
	 */
	public void setTimeID(Long timeID) {
		this.timeID = timeID;
	}

	/**
	 * @param jogadores
	 *            the jogadores to set
	 */
	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

}
