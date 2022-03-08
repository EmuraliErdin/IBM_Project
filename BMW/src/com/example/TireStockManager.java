package com.example;

import java.util.*;

public class TireStockManager {

	private static TireStockManager instance = null;
	private static List<TireStock> tireStock = new LinkedList<>();

	private TireStockManager() {
	}

	public static TireStockManager getInstance() {
		if (instance == null) {
			instance = new TireStockManager();
		}
		return instance;
	}

	public void addTire(Tire t) {
		tireStock.add(new TireStock(10, t));
	}

	public float buyTires(TireStock t, int amount) {
		if (amount != 2 && amount != 4) {
			return 0;
		}

		if (t.getStock() - amount < 0) {
			return 0;
		}

		t.setStock(t.getStock() - amount);

		return (t.getTire().getPrice() - (float) t.getTire().getDiscount() / 100 * t.getTire().getPrice()) * amount;
	}

	public float showPricePerTire(TireStock t) {
		return (t.getTire().getPrice() - (float) t.getTire().getDiscount() / 100 * t.getTire().getPrice());
	}

	public List<TireStock> getTiresThatMatch(int size) {
		return tireStock.stream().filter(e -> e.getTire().getSize() == size && e.getStock() > 0).toList();
	}

}
