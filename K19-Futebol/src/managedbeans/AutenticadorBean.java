package managedbeans;

import java.util.HashMap;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
@ManagedBean
public class AutenticadorBean {
	
	private static Map<String, String> mapa = new HashMap<String, String>();
	private String usuario;
	private String senha;
	
	static {
		AutenticadorBean.mapa.put("k19", "k19");
		AutenticadorBean.mapa.put("jonas.hirata", "jonas.hirata");
		AutenticadorBean.mapa.put("marcelo.martins", "marcelo.martins");
		AutenticadorBean.mapa.put("rafael.cosentino", "rafael.cosentino");
	}

	public String autentica() {
		FacesContext fc = FacesContext.getCurrentInstance();
		if (AutenticadorBean.mapa.containsKey(this.usuario)
				&& AutenticadorBean.mapa.get(this.usuario).equals(this.senha)) {
			ExternalContext ec = fc.getExternalContext();
			HttpSession session = (HttpSession) ec.getSession(false);
			session.setAttribute("usuario", this.usuario);
			return "/times";
		} else {
			FacesMessage fm = new FacesMessage("usuário e/ou senha inválidos");
			fm.setSeverity(FacesMessage.SEVERITY_ERROR);
			fc.addMessage(null, fm);
			return "/login";
		}
	}

	public String registraSaida() {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpSession session = (HttpSession) ec.getSession(false);
		session.removeAttribute("usuario");
		return "/login";
	}

	/**
	 * @return the mapa
	 */
	public static Map<String, String> getMapa() {
		return mapa;
	}

	/**
	 * @param mapa the mapa to set
	 */
	public static void setMapa(Map<String, String> mapa) {
		AutenticadorBean.mapa = mapa;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
