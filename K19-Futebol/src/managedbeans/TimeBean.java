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

import model.entities.Time;
import model.repositories.TimeRepository;

@ManagedBean(name = "timeBean")
public class TimeBean {
	private Time time = new Time();
	private List<Time> times = new ArrayList<Time>();

	public void adiciona(AjaxBehaviorEvent event ) {
		EntityManager manager = this.getManager();
		TimeRepository repository = new TimeRepository(manager);

		if (this.time.getId() == null)
			repository.adiciona(time);
		else
			repository.atualiza(time);
		this.time = new Time();
		this.time = null;

	}

	public void preparaAlteracao(AjaxBehaviorEvent event ) {
		Long id = getId();
		EntityManager manager = this.getManager();
		TimeRepository repository = new TimeRepository(manager);
		this.time = repository.procura(id);
	}

	public void remove(AjaxBehaviorEvent event) {
		Long id = getId();
		EntityManager manager = this.getManager();
		TimeRepository repository = new TimeRepository(manager);
		repository.remove(id);
		this.time = null;

	}

	public List<Time> getTimes() {
		if (this.times == null) {
			EntityManager manager = this.getManager();
			TimeRepository repository = new TimeRepository(manager);
			this.times = repository.getLista();

		}
		return this.times;

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

	/**
	 * @param times
	 *            the times to set
	 */
	public void setTimes(List<Time> times) {
		this.times = times;
	}

}
