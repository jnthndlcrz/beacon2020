package com.beacon.java.training.checkpoint03;

public abstract class GroceryBill {
	
	protected Item[] items = new Item[200];
	ShoppingClerk clerk;

	public GroceryBill (ShoppingClerk clerk) {
		this.clerk = clerk;
	}
	
	public void addItem(Item item) {
		for (int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] =item;
				break;
			}	
		}
	}
	
	public void printReceipt() {
		for (int i = 0; i < items.length; i++) {	
			if (items[i]== null) {
				break;
			}
			System.out.println(items[i].getName() + "          " + items[i].getPrice());
		}
	}
	
	public abstract double getTotalBill();
}
