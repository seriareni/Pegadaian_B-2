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
	
	
}
