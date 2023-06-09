package com.stocks.stockanalysts1.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.stocks.stockanalysts1.model.Stock;


@Service
public interface Stockservice {

	public Stock saveStock(Stock stock);
	public List<Stock> getStocks(String email);
	
    public Stock delStock(Stock bond);

	
}
