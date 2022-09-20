package com.test1;

import java.util.Scanner;

public class GreatestNoBtw3 {
	public static void main(String[] args) {
		// Write a code to find out the greatest number between three number?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number1 = ");
		int Number1 = sc.nextInt();
		
		System.out.println("Number2 = ");
		int Number2 = sc.nextInt();
		
		System.out.println("Number3 = ");
		int Number3 = sc.nextInt();
		
	  if (Number1>Number2){
              if(Number1>Number3) {
            	  System.out.println("Greatest number is  "+Number1);
              }
              else {
            	  System.out.println("Greatest number is "+Number2);
              }
	}
	  else if (Number2>Number1) {
		  if (Number2>Number3) {
			  System.out.println("Greatest number is "+Number2);
		  }
		  else {
			  System.out.println("Greatest number is "+Number3);
		  }

       }
	}
}
