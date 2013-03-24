package managedbeans;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "contatoBean")
public class ContatoSACBean {
	private String nome;
	private String email;
	private String codigoDeArea;
	private String numeroDoTelefone;
	private Boolean sexo;
	private Integer numeroPedido;
	private String assunto;
	private String comentario;

	private static Map<String, Object> assuntos;
	static {
		assuntos = new LinkedHashMap<String, Object>();
		assuntos.put("Entrega", 1);
		assuntos.put("Pagamento", 2);
		assuntos.put("Trocas ou devoluções", 3);
		assuntos.put("Dúvidas gerais", 4);
		assuntos.put("Comentários", 5);
	}

	public Map<String, Object> getAssuntos() {
		return assuntos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodigoDeArea() {
		return codigoDeArea;
	}

	public void setCodigoDeArea(String codigoDeArea) {
		this.codigoDeArea = codigoDeArea;
	}

	public String getNumeroDoTelefone() {
		return numeroDoTelefone;
	}

	public void setNumeroDoTelefone(String numeroDoTelefone) {
		this.numeroDoTelefone = numeroDoTelefone;
	}

	public Boolean getSexo() {
		return sexo;
	}

	public void setSexo(Boolean sexo) {
		this.sexo = sexo;
	}

	public Integer getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(Integer numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
