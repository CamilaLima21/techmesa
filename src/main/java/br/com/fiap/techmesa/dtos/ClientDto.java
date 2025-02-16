package br.com.fiap.techmesa.dtos;

import java.time.LocalDate;

import br.com.fiap.techmesa.entities.Address;

public record ClientDto(
		long id,
		String name,
		String email,
		LocalDate registrationDate,
		Address address) {}
