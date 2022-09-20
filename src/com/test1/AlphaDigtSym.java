package com.test1;

import java.util.Scanner;

public class AlphaDigtSym {
	//Write a Java program to input any character and check whether it is alphabet, digit or special character
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the char : ");
			
			char ch = sc.next().charAt(0);
			
			if((ch>='A' && ch<='Z') || (ch>= 'a' && ch<= 'z'))
			{
			System.out.println("Alphabet");
			} else if (ch>= '1' && ch<= '9')
			{
				System.out.println("Digit");
			}else {
				System.out.println("Symbol");
			}
			
		}

}
