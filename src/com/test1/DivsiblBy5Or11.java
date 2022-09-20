package com.test1;

import java.util.Scanner;

public class DivsiblBy5Or11 {
	// Write a Java program to check whether a number is divisible by 5 and 11 or not?

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a Number : ");
		int numb = sc.nextInt();
		
		if (0==numb%5 && 0==numb%11)
		{
			System.out.println("Number is divisible by 5 and 11.");
			
		}else {
			System.out.println("Number is not divisible by 5 and 11.");
		}

	}

}
