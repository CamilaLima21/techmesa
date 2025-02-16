package br.com.fiap.techmesa.enums;

import lombok.Getter;

@Getter
public enum StatusTableOccupationEnum {

	AVAILABLE("AVAILABLE"),
	BUSY("BUSY");
	
	private final String status;
	
	StatusTableOccupationEnum(String status) {
		this.status = status;
	}
}
