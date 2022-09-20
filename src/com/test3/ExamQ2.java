package com.test3;

import java.util.Scanner;

public class ExamQ2 {
	static boolean ispresent;
	public static boolean findThree(int num)
	{
		while(num>0) {
			int rim=num%10;
			if(rim==3) {
			ispresent=true;
			}num=num/10;
		}
		return ispresent;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		ExamQ2 cr = new ExamQ2();
		cr.findThree(num);
		System.out.println(ispresent);
	}

}
