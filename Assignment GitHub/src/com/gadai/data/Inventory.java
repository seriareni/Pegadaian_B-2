package com.gadai.data;

public class Inventory {
	String name;
	String productCategory;
	String description;
	double price;
	
	public Inventory(String name, String productCategory, String description, double price) {
		super();
		this.name = name;
		this.productCategory = productCategory;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}