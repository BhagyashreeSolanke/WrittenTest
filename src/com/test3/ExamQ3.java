package com.test3;

import java.util.Scanner;

public class ExamQ3 {

	public static void main(String[] args) {
		int add=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			add=add+i;
		}
         System.out.println(add);
	}

}
