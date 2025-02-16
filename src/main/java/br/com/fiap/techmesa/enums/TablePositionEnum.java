package br.com.fiap.techmesa.enums;

public enum TablePositionEnum {
	
	INTERNAL("INT"),
	EXTERNAL("EXT"),
	TERRACE("TER");
	
	private final String code;
	
	private TablePositionEnum(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

}
