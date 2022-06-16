package com.javacourse.productlisttekrar.main;

import java.time.LocalDate;

public class Product {
	
	private String name;
	private LocalDate productionDate;
	private int lastDate;
	private boolean rafaUygunMu;
	
	public Product(String name, LocalDate productionDate, int lastDate) {
		super();
		this.name = name;
		this.productionDate = productionDate;
		this.lastDate = lastDate;
		this.setRafaUygunMu();
	}

	public boolean rafaUygunlugunuKontrolEt() {
		
		LocalDate stt = this.productionDate.plusYears(this.lastDate);
		LocalDate today = LocalDate.now();
		
		if(stt.isAfter(today)) {

			return true;
			
		}else
		
		
		return false;
	}

	public String getName() {
		return name;
	}

	public LocalDate getProductionDate() {
		return productionDate;
	}

	public int getLastDate() {
		return lastDate;
	}

	public boolean isRafaUygunMu() {
		return rafaUygunMu;
	}

	public void setRafaUygunMu() {
		this.rafaUygunMu = rafaUygunlugunuKontrolEt();
	}
	
	

}
