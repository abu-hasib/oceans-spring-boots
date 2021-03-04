package com.ridwan.crudapi.locker;

public class Locker {
	private String city;
	private String dimension;
	private String price;
	private String rate;
	private String quantityInStock;
	
	public Locker(String city, String dimension, String price, String rate, String quantityInStock) {
		this.city = city;
		this.dimension = dimension;
		this.price = price;
		this.rate = rate;
		this.quantityInStock = quantityInStock;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(String quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
}
