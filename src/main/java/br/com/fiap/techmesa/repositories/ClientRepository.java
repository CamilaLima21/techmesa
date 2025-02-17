package br.com.fiap.techmesa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.techmesa.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

	Client findByEmail(String email);
	
	Client findByName(String name);
	
	List<Client> findByNameContainsIgnoreCase(String partName);
}
