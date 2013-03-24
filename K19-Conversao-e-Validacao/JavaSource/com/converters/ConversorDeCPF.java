package com.converters;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import com.model.CPF;
import com.utils.FacesUtil;


public class ConversorDeCPF implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		value = value.trim();
		
		if(!Pattern.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}",value)){
			FacesMessage message = new FacesMessage("Número de CPF inválido");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ConverterException(message);
		}
		String numero = value.substring(0,3)+value.substring(4, 7) + value.substring(8, 11);		 
		Integer numeroDeIdentificacao = Integer.parseInt(numero);
		Integer primeiroDigitoVerificador = Integer.parseInt(value.substring(12,13));
		Integer segundoDigitoVerificador = Integer.parseInt(value.substring(13,14));
		
		CPF cpf = new CPF();		
		cpf.setNumeroDeIdentificacao(numeroDeIdentificacao);
		cpf.setPrimeiroDigitoVerificador(primeiroDigitoVerificador);
		cpf.setSegundoDigitoVerificador(segundoDigitoVerificador);
		
		return cpf;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		CPF cpf = (CPF) value;
		return FacesUtil.getPrintCPF(cpf);
	}

}
