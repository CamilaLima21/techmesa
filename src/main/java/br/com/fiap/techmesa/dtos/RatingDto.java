package br.com.fiap.techmesa.dtos;

import java.time.LocalDate;

import br.com.fiap.techmesa.entities.Client;

public record RatingDto(
		long id,
		Client client,
		String title,
		String text,
		int note,
		LocalDate dateRegistration) {}
