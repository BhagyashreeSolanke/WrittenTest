package com.test1;

import java.util.Scanner;

public class LeapYear {
	// 4.Write a  program to check whether a year is leap year or not 

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year : ");
		int year = sc.nextInt();
		
		if (year%4==0 && year%100!=0) {
			System.out.println("Leap Year");
		} else if (year%100==0 && year%400==0)
		{
			System.out.println("Leap Year");
		}
		else 
			System.out.println("Not Leap year");
	}
}
