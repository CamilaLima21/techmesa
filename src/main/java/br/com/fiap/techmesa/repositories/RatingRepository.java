package br.com.fiap.techmesa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.techmesa.entities.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long>{

}
