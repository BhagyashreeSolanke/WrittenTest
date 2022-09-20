package com.test1;

import java.util.Scanner;

public class AreaOfEquLtrTriangle {
  //1. Write a  program to calculate area of an equilateral triangle.
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Side = ");
		int sd=sc.nextInt();
		
		double area=1.7*sd*sd;
		System.out.println("Area of equilateral triangle is "+area);

	}

}
