package com.vasyl.main;

import java.util.Scanner;
import com.vasyl.exceptions.EvenNumberException;

public class Simulation {

	public static void main(String[] args) {
		try {
			getInput();
		} catch(EvenNumberException e) {
			e.printStackTrace();
		}
	}
	
	public static void getInput() throws EvenNumberException {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please, enter your number here and press Enter...");
		String stringNum = in.nextLine();
		System.out.println("Your number is: " + stringNum);
		
		if(isEven(stringNum)) {
			try {
				throw new EvenNumberException();
			} finally {
				in.close();
			}
		}
		
		in.close();
	}
	
	public static boolean isEven(String num) {
		int i = Integer.parseInt(num); 
		return (i % 2 == 0);
	}
	
}
