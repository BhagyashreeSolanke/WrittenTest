package com.test1;

import java.util.Scanner;

public class SimpleCalculator {
	
	public static void main (String [] args) {
		//Write a Java program to create Simple Calculator?
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first number: ");
		int numb1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int numb2 = sc.nextInt();
		
		
		System.out.println("Which operation you want to perform: \n 1 Addition \n 2 Substraction \n 3 Multiplication \n 4 Division");
		int x = sc.nextInt();
		
		
		switch(x)
		{
		case 1: System.out.println("Addition = "+(numb1 + numb2));
		     break;
		case 2: System.out.println("Subtraction ="+(numb1 - numb2));
		     break;
		case 3: System.out.println("Multiplication = "+(numb1 * numb2));
		     break;
		case 4: System.out.println("Division = "+(numb1/numb2));
		     break;
		default: System.out.println("No Operation Available.");
		     break;
		}	
		
	}
		
}

