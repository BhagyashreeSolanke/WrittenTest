package com.test3;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// Series	0,3,8,15,24,35,48.....nterms
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter nth number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
           int ans=i*i-1;
           System.out.println(ans+" , ");
		}
		


	}

}
