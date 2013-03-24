package com.ibm.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
public class LoginBean {
	private String usuario;
	private String senha;

	public String entrar() {
		if ("admin".equals(this.usuario) && "admin".equals(this.senha)) {
			HttpSession session = (HttpSession) FacesContext
					.getCurrentInstance().getExternalContext()
					.getSession(false);
			session.setAttribute("autenticado", true);
			return "/selecoes";
		} else {
			return "/login";
		}
	}

	public String sair() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
		session.removeAttribute("autenticado");
		return "/ate-logo";
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
