package com.gadai.menu;
import java.util.Scanner;

public class Gadai {
	Scanner input = new Scanner(System.in);
	
	int countID;
	int itemCount;
	int id;
	double biaya;
	String name;
	String product;
	String description;
	double price;
	int stringLength;
	
	public Gadai(Scanner input, int countID, int itemCount, int id, double biaya, String name, String product,
			String description, double price, int stringLength) {
		super();
		this.input = input;
		this.countID = countID;
		this.itemCount = itemCount;
		this.id = id;
		this.biaya = biaya;
		this.name = name;
		this.product = product;
		this.description = description;
		this.price = price;
		this.stringLength = stringLength;
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

	public int getCountID() {
		return countID;
	}

	public void setCountID(int countID) {
		this.countID = countID;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBiaya() {
		return biaya;
	}

	public void setBiaya(double biaya) {
		this.biaya = biaya;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
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

	public int getStringLength() {
		return stringLength;
	}

	public void setStringLength(int stringLength) {
		this.stringLength = stringLength;
	}

	
}
