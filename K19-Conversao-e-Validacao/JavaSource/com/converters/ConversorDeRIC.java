package com.converters;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import com.model.RIC;
public class ConversorDeRIC implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		String ricString = value.trim();		
		if(!Pattern.matches("[0-9]{10}[-]?[0-9]", ricString)){
			FacesMessage message = new FacesMessage("Número de RIC inválido");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ConverterException(message);
		}
		
		ricString = ricString.replaceAll("-", "");
		
		RIC ric = new RIC();
		ric.setNumeroDeIdentificacao(ricString.substring(0,10));
		ric.setDigitoVerificador(ricString.substring(10,11));
		
		return ric;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		RIC ric = (RIC) value;
		return ric.getNumeroDeIdentificacao()+"-"+ric.getDigitoVerificador();
	}

}
