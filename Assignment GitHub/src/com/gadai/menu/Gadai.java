package com.gadai.menu;

import com.gadai.data.Inventory;
import java.util.*;

public class Gadai {
	Scanner input = new Scanner(System.in);
//	ArrayList newInventory;
	
	int countID;
	int itemCount;
	int id;
	double biaya;
	String name;
	String product;
	String description;
	double price;
	int stringLength;
	
	public Gadai(int countID, int itemCount, int id, double biaya, String name, String product,
			String description, double price, int stringLength) {
		super();
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

	public Gadai(ArrayList newInventory, String name, int itemCount, String product, String description, double price, int stringLength) {
		do {
			try {
				System.out.println("Detail Information");
				System.out.println("==================");
				System.out.println("Name: ");
				name = input.nextLine();
				stringLength = name.length();
				if(stringLength >= 3 && stringLength <= 15) {
					do {
						try {
							System.out.println("Product Category: ");
							product = input.nextLine();
						}catch(Exception e) {
							input.next();
							continue;
						}
					} while(!(product.equalsIgnoreCase("laptop") || product.equalsIgnoreCase("motor") || product.equalsIgnoreCase("emas")));
					if (product.equalsIgnoreCase("laptop") || product.equalsIgnoreCase("motor") || product.equalsIgnoreCase("emas")) {
						do {
							try {
								System.out.println("Description: ");
								description = input.nextLine();
							}catch(Exception e) {
								input.next();
								continue;
							}
						} while(!(description.split(" ").length > 1));
						if (description.split(" ").length > 1) {
							do {
								try {
									System.out.println("Price: ");
									price = input.nextDouble();
								}catch(Exception e) {
									input.next();
									continue;
								}
							}while(!(price % 10000 == 0 && price > 0));
							if (price % 10000 == 0 && price > 0) {
								newInventory.add(new Inventory(newInventory.size()+1, name, product, description, "Gadai", price, price));
								itemCount = newInventory.size();
								this.itemCount = itemCount;
							}
						}
					}
				}
			}catch(Exception e) {
				input.next();
				continue;
			}
		} while(stringLength < 3 || stringLength > 15);
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public int getCountID() {
		return countID;
	}

	public void setCountID(int countID) {
		this.countID = countID;
	}
	
	
}