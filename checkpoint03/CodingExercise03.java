package com.beacon.java.training.checkpoint03;

public class CodingExercise03 {

	public static void main(String[] args) {
	ShoppingClerk sc = new ShoppingClerk("James Smith");
	
	Item item1 = new Item("Panteen Shampoo       ", 25.00, false, 0.00);
	Item item2 = new Item("Creamsilk Conditioner ", 30.00, false, 0.00);
	Item item3 = new Item("Colgate Toothpaste   ", 100.00, true, 10.00);
	Item item4 = new Item("Safeguard Shampoo     ", 50.00, true, 20.00);
	Item item5 = new Item("Pond's Facial Wash    ", 75.00, false, 0.00);
	
	// Is-A relationship
	GroceryBill regBill = new RegularBill(sc);
	regBill.addItem(item1); 
	regBill.addItem(item2);
	regBill.addItem(item3);
	regBill.addItem(item4);
	regBill.addItem(item5);
	
	// Regular Bill
	System.out.println("            >> REGULAR BILL <<");
	System.out.println(" ");
	System.out.println("Clerk: " + sc.getName());
	System.out.println("Item Name                    Item Price");
	System.out.println("---------------------------------------");
	regBill.printReceipt();
	System.out.println("Total Bill: " + regBill.getTotalBill());
	System.out.println("Happy to Serve!");
	
	// Is-A relationship
	GroceryBill discBill = new DiscountedBill(sc);
	discBill.addItem(item1); 
	discBill.addItem(item2);
	discBill.addItem(item3);
	discBill.addItem(item4);
	discBill.addItem(item5);
	
	// Discounted Bill
	System.out.println("\n\n");
	System.out.println("            >> DISCOUNTED BILL <<");
	System.out.println(" ");
	System.out.println("Clerk: " + sc.getName());
	System.out.println("Item Name                    Item Price");
	System.out.println("---------------------------------------");
	discBill.printReceipt();
	System.out.println("Total Bill: " + discBill.getTotalBill());
	System.out.println("Happy to Serve!");
	}	
	}
