package com.example;

import java.util.*;

public class Main {

	private static List<Car> carList = new LinkedList<Car>();
	private static Scanner scanner = new Scanner(System.in);
	private static TireStockManager tsManager = TireStockManager.getInstance();
	private static int totalCost=0;

	private static int displayPrincipalMenu() {
		System.out.println("Hello!");
		System.out.println("Please select a car.");
		System.out.println("Total cost until now: " + totalCost);

		for (int i = 0; i < carList.size(); i++) {
			System.out.println(i + 1 + ". " + carList.get(i).toString());
		}
		System.out.println("0. Exit");

		int choice = scanner.nextInt();
		return choice;

	}

	private static void displayTireMenu(Car c) {
		System.out.println();
		System.out.println();
		System.out.println("Please select the tire type.");
		List<TireStock> tires = tsManager.getTiresThatMatch(c.getTireSize());

		for (int i = 0; i < tires.size(); i++) {
			System.out.println(i + 1 + ". " + tires.get(i).toString() + "; discounted price:"
					+ tsManager.showPricePerTire(tires.get(i)));
		}
		System.out.println("0. Exit");
		int choice = scanner.nextInt();

		System.out.println();
		System.out.println();

		if (choice >= 1 && choice <= tires.size()) {

			System.out.println("How many tires would you like to buy? (answer should be 2 or 4)");
			int amount = scanner.nextInt();
			totalCost += tsManager.buyTires(tires.get(choice - 1), amount);
			System.out.println();
			System.out.println();
		}

	}

	public static void main(String[] args) {

		carList.add(new Car("I8", "BMW", 21));
		carList.add(new Car("Supra", "Toyota", 18));
		carList.add(new Car("V40", "Volvo", 15));
		carList.add(new Car("Series 7", "BMW", 21));
		carList.add(new Car("Fiesta", "Ford", 15));

		tsManager.addTire(new WinterRfTire("Michelin", "15", 15, 500));
		tsManager.addTire(new SummerNormalTire("Dunlop", "18", 18, 650));
		tsManager.addTire(new WinterNormalTire("Hankook", "21", 21, 700));
		tsManager.addTire(new SummerRFTire("YesMan", "21", 21, 580));
		tsManager.addTire(new WinterNormalTire("Pirelli", "15", 15, 700));

		int choice = -1;

		while (choice != 0) {

			choice = displayPrincipalMenu();

			if (choice != 0 && choice <= carList.size()) {
				displayTireMenu(carList.get(choice - 1));
			}
		}

	}

}
