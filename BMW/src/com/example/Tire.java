package com.example;

public abstract class Tire {
	private int size;
	private String model;
	private String brand;
	protected int discount;
	private float price;

	public Tire() {
		this.size = 0;
		this.discount = 0;
		this.model = "";
		this.brand = "";
	}

	public Tire(String brand, String model, int size, float price) {
		this();
		if (brand != null) {
			this.brand = brand;
		}

		if (model != null) {
			this.model = model;
		}

		if (size > 0) {
			this.size = size;
		} else {
			this.size = 0;
		}

		if (discount >= 0 && discount <= 100) {
			this.discount = discount;
		} else {
			this.discount = 0;
		}

		if (price > 0) {
			this.price = price;
		}

	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size > 0) // the size of a tire should not be a negative number
		{
			this.size = size;
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model != null) {
			this.model = model;
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if (brand != null) {
			this.brand = brand;
		}
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;

		if (o == null)
			return false;

		if (getClass() != o.getClass())
			return false;

		Tire t = (Tire) o;

		if (this.brand.equals(t.brand) == false) {
			return false;
		}
		if (this.model.equals(t.model) == false) {
			return false;
		}

		if (this.size != t.size) {
			return false;
		}

		if (this.discount != t.discount) {
			return false;
		}

		if (this.price != t.price) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Brand: ").append(this.brand).append("; model: ").append(this.model)
				.append("; size: ").append(this.size).append("; price per tire: ").append(this.price)
				.append("; discount(%): ").append(this.discount).append("; ");
		return sb.toString();
	}

}
