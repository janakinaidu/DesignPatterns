package com.naidu.designpatternexamples;

public class PaypalStrategy implements PaymentStrategy{
	private String emailid;
	private String password;
	public PaypalStrategy(String emailid,String password){
		this.emailid=emailid;
		this.password=password;
	}
	@Override
	public void pay(int amount) {
		System.out.println(amount+"amount paid using paypal");
		
	}
}
