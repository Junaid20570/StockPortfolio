package com.stocks.stockanalysts1.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
	@Id
	private String stockName;
    private LocalDateTime datetime;
    private float open;
    private float close;
    private float volume;
    private String email;
    private String symbol;
}