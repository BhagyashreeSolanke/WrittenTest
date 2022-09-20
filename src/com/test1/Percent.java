package com.test1;

import java.util.Scanner;

public class Percent {
	//2. Write a  program to enter marks of five subjects and calculate total, average and percentage

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks of subject \n English: \n Marathi: \n Science: \n Maths: \n Social Science: ");
		int eng=sc.nextInt();
		int mar=sc.nextInt();
		int sci=sc.nextInt();
		int math=sc.nextInt();
		int sst=sc.nextInt();
		
		int total=eng+mar+sci+math+sst;
		int avg=total/5;
		int per=(100*total)/500;
		System.out.println(" Total: "+total+"\n Average: "+avg+"\n Percentage: "+per);
	}

}
