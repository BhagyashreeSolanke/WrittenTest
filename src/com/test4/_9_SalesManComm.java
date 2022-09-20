package com.test4;

import java.util.Scanner;

public class _9_SalesManComm {

	public static void main(String[] args) {
		//9. A salesmen is given commission on the basis of sales 
//		he makes .He gets a commission of 5% only if sales made by him is above 
//		2000.WAP to accept sales amount and calculate the commission he gets.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Sales amount : ");
		int sale=sc.nextInt();
		int comm ;
		  
        double ans = (double) ((sale>2000)?(comm=sale*5/100):(comm = 0));
        System.out.println(ans);


	}

}
