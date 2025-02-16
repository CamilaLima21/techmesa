package br.com.fiap.techmesa.dtos;

import br.com.fiap.techmesa.entities.Restaurant;
import br.com.fiap.techmesa.enums.StatusTableOccupationEnum;
import br.com.fiap.techmesa.enums.TablePositionEnum;

public record TableRestaurantDto(
		long id,
		String tableIdentification,
		Restaurant restaurant,
		int numberSeats,
		StatusTableOccupationEnum statusTableOccupation,
		TablePositionEnum tablePosition) {}
