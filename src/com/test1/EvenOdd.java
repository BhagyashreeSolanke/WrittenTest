package com.test1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		
		int num = sc.nextInt();
		
		
		if (0==num%2) {
			System.out.println("Number is Even.");
		}
		else {
			System.out.println("Number is Odd.");
		}

	}

}
