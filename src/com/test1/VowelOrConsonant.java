package com.test1;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		// Write a code to find alphabet is Vowel or Consonant?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Alphabet : ");
		char alpha = sc.next().charAt(0);
		
		if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u')
		{
		System.out.println("Vowel");
				
		}
		else {
			System.out.println("Consonant");
		}
	}

}
