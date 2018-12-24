package com.naidu.designpatternexamples;


public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//Pay by Paypal
		cart.pay(new PaypalStrategy("janakinaidu493@gmail.com", "123456789"));
		
		//Pay by CreditCard
		cart.pay(new CreditCardStrategy("janakinaiud", "12312465", "123", "12/2018"));
	}

}
