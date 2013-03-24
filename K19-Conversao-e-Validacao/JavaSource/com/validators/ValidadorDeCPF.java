package com.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import com.model.CPF;
import com.utils.FacesUtil;

public class ValidadorDeCPF implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {

		CPF cpf = (CPF) value;
		Integer numeroDeIdentificacao = cpf.getNumeroDeIdentificacao();
		Integer primeiroDigitoVerificador = cpf.getPrimeiroDigitoVerificador();
		Integer segundoDigitoVerificador = cpf.getSegundoDigitoVerificador();
		if (!validaCPF(numeroDeIdentificacao, primeiroDigitoVerificador,
				segundoDigitoVerificador)) {
			String numero = FacesUtil.getPrintCPF(cpf);
			FacesMessage message = new FacesMessage("O número " + numero
					+ " não é um CPF válido");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}

	}

	private boolean validaCPF(Integer numeroDeIdentificacao,
			Integer primeiroDigitoVerificador, Integer segundoDigitoVerificador) {

		long primeiroDigito = this.modulo11((long) numeroDeIdentificacao);
		long segundoDigito = this.modulo11((long) numeroDeIdentificacao * 10
				+ primeiroDigito);
		return primeiroDigitoVerificador == primeiroDigito
				&& segundoDigitoVerificador == segundoDigito;
	}

	private long modulo11(Long numero) {
		long soma = 0;
		long multiplicador = 2;
		while (numero > 0) {
			long digito = numero % 10;
			soma += multiplicador * digito;
			numero /= 10;
			multiplicador++;
		}
		long resto = soma % 11;
		if (resto < 2)
			return 0;
		return 11 - resto;
	}
}
