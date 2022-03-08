package com.example;

public class SummerNormalTire extends Tire implements Discountable {

	public SummerNormalTire(String brand, String model, int size, float price) {
		super(brand, model, size, price);
		super.discount = 10;
	}

	@Override
	public int getDiscount() {
		return super.discount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("type: ").append("Summer normal");
		return super.toString() + sb.toString();
	}
}