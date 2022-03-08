package com.example;

public class SummerRFTire extends Tire implements Discountable {

	public SummerRFTire(String brand, String model, int size, float price) {
		super(brand, model, size, price);
		super.discount = 10+5;
	}

	@Override
	public int getDiscount() {
		return super.discount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("type: ").append("Summer run-flat");
		return super.toString() + sb.toString();
	}
}
