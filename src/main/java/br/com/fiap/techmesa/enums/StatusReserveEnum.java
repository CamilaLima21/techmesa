package br.com.fiap.techmesa.enums;

public enum StatusReserveEnum {

	ACTIVE("O"),
	EXPIRED("1"),
	DELETED("2");
	
	private final String code;
	
	private StatusReserveEnum(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
}
