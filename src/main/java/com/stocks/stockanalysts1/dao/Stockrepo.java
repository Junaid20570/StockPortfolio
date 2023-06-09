package com.stocks.stockanalysts1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.stocks.stockanalysts1.model.Stock;

@Repository
public interface Stockrepo extends JpaRepository<Stock, String> {
	
	public List<Stock> findByEmail(String email);

}
