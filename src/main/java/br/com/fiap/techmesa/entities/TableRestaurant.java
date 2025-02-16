package br.com.fiap.techmesa.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.fiap.techmesa.enums.StatusTableOccupationEnum;
import br.com.fiap.techmesa.enums.TablePositionEnum;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "TABLE_RESTAURANT")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class TableRestaurant {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
	private long id;
	
	@Column
	private String tableIdentification;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id")
	private Restaurant restaurant;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "reserve_id", referencedColumnName = "id")
	private Reserve reserve;
	
	@Column(name = "number_seats", nullable = false)
	private int numberSeats;
	
	@Column
	private StatusTableOccupationEnum statusTableOccupation;
	
	@Column
	private TablePositionEnum tablePosition;
}
