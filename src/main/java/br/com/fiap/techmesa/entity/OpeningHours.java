package br.com.fiap.techmesa.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.fiap.techmesa.enums.DayWeekEnum;
import br.com.fiap.techmesa.enums.TurnEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "OPENING_HOURS")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class OpeningHours {
	
	@Id
    @Column(unique = true)
	private long id;
	
	@ManyToOne
    @JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;
	
	@Column(name = "nome", nullable = false)
	private String name;
	
	@Enumerated(EnumType.STRING)
	private TurnEnum turn;
	
	@Enumerated(EnumType.STRING)
	private DayWeekEnum dayWeek;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate startTime;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate endTime;

}
