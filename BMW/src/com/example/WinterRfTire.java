package com.example;

public class WinterRfTire extends Tire implements Discountable {

	public WinterRfTire(String brand, String model, int size, float price) {
		super(brand, model, size, price);
		super.discount = 15 + 5;
	}

	@Override
	public int getDiscount() {
		return super.discount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("type: ").append("Winter run-flat");
		return super.toString() + sb.toString();
	}

}
