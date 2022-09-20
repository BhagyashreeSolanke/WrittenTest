package com.test3;

import java.util.Scanner;

public class ExamQ1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base value:");
		int base=sc.nextInt();
		System.out.println("Enter power value:");
		int power=sc.nextInt();
		int ans=1;
		for(int i=1;i<=power;i++)
		{
			ans=ans*base;
		}
		System.out.println(ans);

	}

}
