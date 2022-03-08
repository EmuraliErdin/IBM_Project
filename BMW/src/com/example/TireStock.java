package com.example;

public class TireStock {

	private int stock = 10;
	private Tire tire;

	public TireStock() {
	}

	public TireStock(int stock, Tire tire) {
		if (stock >= 0) {
			this.stock = stock;
		} else {
			this.stock = 0;
		}
		this.tire = tire;

	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (stock >= 0) {
			this.stock = stock;
		}
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null)
			return false;

		if (getClass() != o.getClass())
			return false;

		TireStock ts = (TireStock) o;

		if (this.tire.equals(ts.tire) == true && this.stock == ts.stock) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(this.tire.toString()).append("; stock:").append(this.stock);
		return sb.toString();
	}

}
