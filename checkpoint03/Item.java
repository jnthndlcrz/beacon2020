package com.beacon.java.training.checkpoint03;

public class Item {
	private String name;
	private double price;
	private boolean isDiscounted;
	private double discountPercentage;
	
	public Item(String name, double price, boolean isDiscounted, double discountPercentage) {
		this.name = name;
		this.price = price;
		this.isDiscounted = isDiscounted;
		this.discountPercentage = discountPercentage;
	}

	// name
	public String getName() {
		return name;
	}
	//public void setName(String name) {
	//	this.name = name;
	//}

	//price
	public double getPrice() {
		return price;
	}
	//public void setPrice(double price) {
	//	this.price = price;
	//}

	// discount(true or false)
	public boolean isDiscounted() {
		return isDiscounted;
	}
	//public void setDiscounted(boolean isDiscounted) {
	//	this.isDiscounted = isDiscounted;
	//}
	
	// discounted price
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	//public void setDiscountPercentage(double discountPercentage) {
	//	this.discountPercentage = discountPercentage;
	//}
	
}
