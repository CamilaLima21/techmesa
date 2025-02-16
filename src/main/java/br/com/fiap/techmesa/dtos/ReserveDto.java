package br.com.fiap.techmesa.dtos;

import java.time.LocalDate;
import java.util.List;

import br.com.fiap.techmesa.entities.Client;
import br.com.fiap.techmesa.entities.Restaurant;
import br.com.fiap.techmesa.entities.TableRestaurant;
import br.com.fiap.techmesa.enums.StatusReserveEnum;

public record ReserveDto(
		long id,
		Client client,
		Restaurant restaurant,
		List<TableRestaurant> tableRestaurant,
		int numberPeople,
		LocalDate dateReserve,
		LocalDate dateCreated,
		LocalDate startReserve,
		int toleranceMinutes,
		LocalDate timeLimit,
		StatusReserveEnum statusReserve) {}
