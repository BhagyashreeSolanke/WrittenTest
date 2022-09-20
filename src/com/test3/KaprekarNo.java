package com.test3;

import java.util.Scanner;

public class KaprekarNo {

	public static void main(String[] args) {
		/*A Kaprekar number is a number whose square when divided 
		into two parts and such that sum of parts is equal to the original number 
		and none of the parts has value 0*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int count=0;
		int dig=0;
		int sqr=num*num;
		int p=sqr;
		int sum=0;
		
		while(sqr>0) {
		
		count++;
		sqr=sqr/10;
		}
		int k=(int)Math.pow(10, count/2);
		while(p>0)
		{
			sum=sum+p%k;
			p=p/k;
		}
		if(num==sum) {
			System.out.println("Kaprekar Number");
		}else {
			System.out.println("Not");
		}
		

	}

}
