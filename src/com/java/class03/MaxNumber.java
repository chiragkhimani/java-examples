package com.java.class03;

import java.util.Scanner;    

public class MaxNumber {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		
		if (a > b) {
			System.out.println(a + " is greater");
		} else {
			System.out.println(b + " is greater");
		}

	}
}