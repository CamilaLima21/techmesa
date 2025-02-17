package br.com.fiap.techmesa.dtos;

import java.time.LocalDate;
import java.util.List;

import br.com.fiap.techmesa.entities.Address;
import br.com.fiap.techmesa.entities.OpeningHours;
import br.com.fiap.techmesa.entities.Reserve;
import br.com.fiap.techmesa.entities.TableRestaurant;
import br.com.fiap.techmesa.enums.StatusRestaurantEnum;
import br.com.fiap.techmesa.enums.TypeKitchenEnum;

public record RestaurantDto(
		long id,
		String name,
		Address address,
		String email,
		List<OpeningHours> openingHours,
		List<Reserve> reserve,
		List<TableRestaurant> tableRestaurant,
		TypeKitchenEnum typeKitchen,
		int capacity,
		StatusRestaurantEnum statusRestaurant,
		LocalDate registrationDate) {}
