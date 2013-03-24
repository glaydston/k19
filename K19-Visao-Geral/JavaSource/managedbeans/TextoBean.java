package managedbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "texto")
public class TextoBean {
	private String texto;

	public String transformaEmCaixaAlta() {
		this.texto = texto.toUpperCase();
		return "resposta";
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
