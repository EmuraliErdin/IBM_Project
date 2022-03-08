package com.example;

import java.util.*;

public class Car {

	private String model;
	private String brand;
	private final int tireSize;

	public Car(int tireSize) {
		this.tireSize = tireSize;
	}

	public Car(String model, String brand, int tireSize) {
		this.tireSize = tireSize;
		this.model = model;
		this.brand = brand;

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getTireSize() {
		return tireSize;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder("Brand: ").append(this.brand).append("; model: ").append(this.model)
				.append("; tire size: ").append(this.tireSize);

		return sb.toString();
	}

}
