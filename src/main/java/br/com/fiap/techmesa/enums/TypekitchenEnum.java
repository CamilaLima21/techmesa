package br.com.fiap.techmesa.enums;

public enum TypekitchenEnum {

	JAPANESE("JP"),
	ITALIAN("IT"),
	CHINESE("CN"),
	BRAZILIAN("BR"),
	INDIAN("IN"),
	THAI("TH"),
	PERUVIAN("PE"),
	FRENCH("FR"),
	ORIENTAL("ORI"),
	MEDITERRANEAN("MED"),
	INTERNATIONAL("INT");
	
	private final String acronym;
	
	TypekitchenEnum(String acronym) {
		this.acronym = acronym;
	}
	
	public String getAcronym() {
		return acronym;
	}
}
