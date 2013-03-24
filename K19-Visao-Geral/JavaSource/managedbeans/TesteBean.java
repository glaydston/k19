package managedbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TesteBean {
	private Integer numero;

	public void incrementaNumero(){
		this.numero = numero + 1;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}	
	

}
