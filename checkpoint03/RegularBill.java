package com.beacon.java.training.checkpoint03;

public class RegularBill extends GroceryBill {

	public RegularBill(ShoppingClerk clerk) {
		super(clerk);
	}

	@Override
	public double getTotalBill() {
		double total = 0;	
		for (int i = 0; i < items.length; i++) {
			if (items[i]== null) {
				break;
			}
			total = total + items[i].getPrice();
		}
		return total;
	}

}
