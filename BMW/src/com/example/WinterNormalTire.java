package com.example;

public class WinterNormalTire extends Tire implements Discountable {

	public WinterNormalTire(String brand, String model, int size, float price) {
		super(brand, model, size, price);
		super.discount = 15;
	}

	@Override
	public int getDiscount() {
		return super.discount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("type: ").append("Winter normal");
		return super.toString() + sb.toString();
	}
}
