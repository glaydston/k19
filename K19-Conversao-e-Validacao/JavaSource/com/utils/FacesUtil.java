package com.utils;

import com.model.CPF;

public class FacesUtil {
	public static String getPrintCPF(CPF cpf){
		return cpf.getNumeroDeIdentificacao().toString().substring(0, 3) 
		+ "." + cpf.getNumeroDeIdentificacao().toString().substring(3, 6)
		+ "." + cpf.getNumeroDeIdentificacao().toString().substring(6, 9)
		+ "-" + cpf.getPrimeiroDigitoVerificador()
		+ cpf.getSegundoDigitoVerificador();
	}
}
