package br.com.fiap.techmesa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.fiap.techmesa.entities.Restaurant;
import br.com.fiap.techmesa.enums.TypeKitchenEnum;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{

	Restaurant findByEmail(String email);
	
	Restaurant findByName(String name);
	
	List<Restaurant> findByNameContainsIgnoreCase(String partName);
	
	@Query("SELECT r FROM Restaurant r WHERE r.address.city = :city")
	List<Restaurant> findByCity(String city);
	
	@Query("SELECT r FROM Restaurant r WHERE r.address.city = :city AND r.address.neighborhood = :neighborhood")
	List<Restaurant> findByCityAndNeighborhood(String city, String neighborhood);
	
	List<Restaurant> findByTypeKitchen(TypeKitchenEnum typekitchen);
}
