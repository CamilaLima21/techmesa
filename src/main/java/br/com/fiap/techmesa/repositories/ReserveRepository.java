package br.com.fiap.techmesa.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.techmesa.entities.Client;
import br.com.fiap.techmesa.entities.Reserve;
import br.com.fiap.techmesa.entities.Restaurant;

@Repository
public interface ReserveRepository extends JpaRepository<Reserve, Long>{

	List<Reserve> findByRestaurantAndDateReserve(Restaurant restaurant, LocalDate dateReserve);
	
	List<Reserve> findByClientAndDateReserve(Client client, LocalDate dateReserve);
	
	List<Reserve> findByRestaurantAndClientAndDateReserve(Restaurant restaurant, Client client, LocalDate dateReserve);
}
