package br.com.fiap.techmesa.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.fiap.techmesa.enums.StatusRestaurantEnum;
import br.com.fiap.techmesa.enums.TypekitchenEnum;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "RESTAURANT")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Restaurant {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
	private long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY)  
	List<OpeningHours> openingHours;
	
	@OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY)  
	List<Reserve> reserve;
	
	@OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY)  
	List<TableRestaurant> tableRestaurant;
	
	@Column
	private TypekitchenEnum typeKitchenEnum;
	
	@Column
	private int capacity;
	
	@Column
	private StatusRestaurantEnum statusRestaurant;
	
	 @Column(nullable = false, columnDefinition = "DATE")
	private LocalDate registrationDate;
	
}
