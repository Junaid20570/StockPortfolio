package com.stocks.stockanalysts1.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stocks.stockanalysts1.dao.Stockrepo;
import com.stocks.stockanalysts1.model.Stock;


@Service
public class Stockimpl implements Stockservice{

	@Autowired
	Stockrepo repo;
	
	@Override
	public Stock saveStock(Stock stock) {
		// TODO Auto-generated method stub
		return repo.save(stock);
	}

	@Override
	public List<Stock> getStocks(String email) {
		// TODO Auto-generated method stub
		return repo.findByEmail(email);
	}

	@Override
	public Stock delStock(Stock bond) {
		// TODO Auto-generated method stub
		repo.deleteById(bond.getStockName());
		return bond;
	}

}
