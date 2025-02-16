package br.com.fiap.techmesa.dtos;

public record AddressDto(
		long id,
		String street,
		int number,
		String neighborhood,
		String state,
		String city,
		String country,
		String cep) {}
