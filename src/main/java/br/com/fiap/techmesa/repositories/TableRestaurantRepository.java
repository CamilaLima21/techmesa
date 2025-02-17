package br.com.fiap.techmesa.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.techmesa.entities.Restaurant;
import br.com.fiap.techmesa.entities.TableRestaurant;

@Repository
public interface TableRestaurantRepository extends JpaRepository<TableRestaurant, Long>{

	TableRestaurant findByTableIdentification(String tableIdentification);
	
	List<TableRestaurant> findByRestaurantAndReserveDateReserve(Restaurant restaurant, LocalDate dateReserve);
}
