package br.com.fiap.techmesa.dtos;

import java.time.LocalDate;

import br.com.fiap.techmesa.entities.Restaurant;
import br.com.fiap.techmesa.enums.DayWeekEnum;
import br.com.fiap.techmesa.enums.TurnEnum;

public record OpeningHoursDto(
		long id,
		Restaurant restaurant,
		String name,
		TurnEnum turn,
		DayWeekEnum dayWeek,
		LocalDate startTime,
		LocalDate endTime) {}
