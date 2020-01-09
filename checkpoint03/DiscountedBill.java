package com.beacon.java.training.checkpoint03;

public class DiscountedBill extends GroceryBill {

	public DiscountedBill(ShoppingClerk clerk) {
		super(clerk);
	}

	@Override
	public double getTotalBill() {
		double total = 0;	
		for (int i = 0; i < items.length;i++) {
			if (items[i]== null) {
				break;
			}
			if (items[i].isDiscounted()) {
				total = total + (items[i].getPrice() - (items[i].getPrice() * (items[i].getDiscountPercentage()/100)));
			} else {
				total = total + (items[i].getPrice());
			}
	}
		return total;
	}
}
