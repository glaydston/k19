package managedbeans;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ConversorMonetarioBean {
	private String de;
	private String para;
	private Double valor;

	private Double resultado;

	private static Map<String, Double> taxas;
	static {
		taxas = new LinkedHashMap<String, Double>();
		taxas.put("Real", 1.0);
		taxas.put("Euro", 2.33);
		taxas.put("Peso Argentino", 0.42);
		taxas.put("Dolar Americao", 1.88);
	}
	
	public Map<String, Double> getTaxa(){
		return taxas;
	}

	public void converte() {
		this.resultado = this.valor * taxas.get(this.de) / taxas.get(this.para);
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	

}
