package br.com.fiap.techmesa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = -8830232646598897986L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
