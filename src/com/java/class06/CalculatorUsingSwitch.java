package com.java.class06;

public class CalculatorUsingSwitch {
	public static void main(String args[]) {
		int num1 = 10, num2 = 20;

		String c = "Add";

		switch (c) {

		case "Add":
			System.out.println(num1 + num2);
			break;

		case "Sub":
			System.out.println(num1 - num2);
			break;

		case "Mul":
			System.out.println(num1 * num2);
			break;

		case "Div":
			System.out.println(num1 / num2);
			break;

		default:
			System.out.print("Error");

		}

	}
}
