package com.stocks.stockanalysts1.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stocks.stockanalysts1.model.Stock;
import com.stocks.stockanalysts1.service.Stockservice;

@CrossOrigin
@RestController
@RequestMapping("stock")
public class Stockcontroller {

	@Autowired
	Stockservice service;
	
	@PostMapping("/stock/{stockName}/{email}")
	public ResponseEntity<Stock> saveStock(@RequestBody Stock stock, @PathVariable String stockName, @PathVariable String email){
		stock.setEmail(email);
		stock.setStockName(stockName);
		Stock stock2 = service.saveStock(stock);
		return new ResponseEntity<Stock>(stock2,HttpStatus.OK);
	}
	@GetMapping("/stock/{email}")
	public ResponseEntity< List<Stock>> getStock(@PathVariable String email){
		
		 List<Stock> stock2 = service.getStocks(email);
		return new ResponseEntity< List<Stock>>(stock2,HttpStatus.OK);
	}
	
	   @DeleteMapping("/sellStock")
	   public ResponseEntity<Stock> sellBond(@RequestBody Stock bond){
		   Stock finalBond=service.delStock(bond);
		   return new ResponseEntity<Stock>(finalBond,HttpStatus.OK);
		   
	   }
	
}
