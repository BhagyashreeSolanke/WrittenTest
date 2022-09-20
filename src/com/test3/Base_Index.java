package com.test3;

import java.util.Scanner;

public class Base_Index {

	public static void main(String[] args) {
		// 2.	WAP to calculate x y  where x is base and y is index without using ready made function?
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base:");
		int base=sc.nextInt();
		System.out.println("Enter the exponent:");
		int expo=sc.nextInt();
		int power=1;
		for(int i=1;i<=expo;i++)
		{
			power=power*base;
		}
         System.out.println(power);
	}

}
