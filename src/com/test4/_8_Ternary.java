package com.test4;

import java.util.Scanner;

public class _8_Ternary {

	public static void main(String[] args) {
		//8.	Rewrite the following program segment using Ternary statement. 	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value: ");
		
		int sale =sc.nextInt();
		int comm ;
			  
           double ans = (double) ((sale>15000)?(comm=sale*5/100):(comm = 0));
           System.out.println(ans);

	}

}
