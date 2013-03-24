package managedbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class NumeroAleatorioBean {
	private Integer maximo;
	private Integer numeroAleatorio;

	public String geraNumeroAleatorio() {
		this.numeroAleatorio = (int) (Math.random() * this.maximo);
		return "resposta";
	}

	/**
	 * @return the maximo
	 */
	public Integer getMaximo() {
		return maximo;
	}

	/**
	 * @param maximo
	 *            the maximo to set
	 */
	public void setMaximo(Integer maximo) {
		this.maximo = maximo;
	}

	/**
	 * @return the numeroAleatorio
	 */
	public Integer getNumeroAleatorio() {
		return numeroAleatorio;
	}

	/**
	 * @param numeroAleatorio
	 *            the numeroAleatorio to set
	 */
	public void setNumeroAleatorio(Integer numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}

}
