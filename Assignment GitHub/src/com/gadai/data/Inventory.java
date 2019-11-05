package com.gadai.data;

public class Inventory {
	int id;
	String name;
	String productCategory;
	String description;
	String status;
	double price;
	double utang;
	
	public Inventory(int id, String name, String productCategory, String description, String status, double price,
			double utang) {
		super();
		this.id = id;
		this.name = name;
		this.productCategory = productCategory;
		this.description = description;
		this.status = status;
		this.price = price;
		this.utang = utang;
	}
	
	public static void printHeaderTebus() {
        String leftAlignFormat = "| %-15s | %-8s | %-10s | %-9s | %-15s | %n";

        printLine();
        System.out.format(leftAlignFormat, "ID", "Product", "Price", "Status", "Utang");
        printLine();
    }
	
    public static void printLine() {
        System.out.format("---------------------------------------------------%n");
    }

    public void printRowTebus() {
        String leftAlignFormat = "| %-15s | %-8s | %.2f | %-9s |  %.2f | %n";
        System.out.format(leftAlignFormat, id, productCategory, price, status, utang);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getUtang() {
		return utang;
	}

	public void setUtang(double utang) {
		this.utang = utang;
	}
}
