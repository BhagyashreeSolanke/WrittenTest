package com.test2;

import java.util.Scanner;

public class Trimorphic {

	public static void main(String[] args) {
		
		// write a java program to check given number is trimorphic  number or not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int N = sc.nextInt();
		boolean isTrimo=true;
		int cube=N*N*N;
		while(N>0) {
			if(N%10!=cube%10) {
				isTrimo=false;
				N/=10;
				cube/=10;
			}
			isTrimo=true;
				
		} 
		if (isTrimo==true) {
			System.out.println("trimorphic");
		} else {
			System.out.println("No");
		}

	}

}
