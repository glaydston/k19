package com.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.model.Sexo;
@FacesConverter(forClass=Sexo.class)
public class ConversorDeSexo implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		value=value.trim();
		Sexo sexo = new Sexo();
		sexo.setTipoSexo(value);
		if(value.equals("M"))	
			sexo.setTipoSexo("Masculino");
		else
			sexo.setTipoSexo("Feminino");
			
		return sexo;
	}	

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Sexo sexo = (Sexo) value;		
		return sexo.getTipoSexo();
	}

}
