package br.com.fiap.techmesa.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.fiap.techmesa.enums.StatusReserveEnum;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "RESERVE")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Reserve {

	@Id
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
	private Client client;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id")
	private Restaurant restaurant;
	
	@OneToMany(mappedBy = "reserve", fetch = FetchType.LAZY)
	private List<Table> table;
	
	@Column
	private int numberPeople;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate dateReserve;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate dateCreated;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate startReserve;
	
	@Column
	private int toleranceMinutes;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate timeLimit;
	
	@Column
	private StatusReserveEnum statusReserve;
}
