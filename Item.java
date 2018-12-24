package com.naidu.designpatternexamples;

public class Item {
	private String upcode;
	private int price;

	public Item(String upcode, int price) {
		this.upcode = upcode;
		this.price = price;
	}

	public String getUpcode() {
		return upcode;
	}

	public void setUpcode(String upcode) {
		this.upcode = upcode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
