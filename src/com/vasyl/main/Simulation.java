package com.vasyl.main;

import java.util.Scanner;

public class Simulation {

	public static void main(String[] args) {
		getInput();
	}
	
	public static void getInput() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please, enter your number here and press Enter...");
		String inputNum = in.nextLine();
		System.out.println("Your number is: " + inputNum);
		
		in.close();
	}
	
	public static boolean isEven(String num) {
		int i = Integer.parseInt(num); 
		return (i % 2 == 0);
	}

}
