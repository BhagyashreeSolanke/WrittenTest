package com.test2;

import java.util.Scanner;

public class FactSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter nth number : ");
     int n = sc.nextInt();
     int sum = 0;
     int fac=1;
     for(int i=1;i<=n;i++) {
    	 fac=fac*i;
    	 sum=sum+fac;
    	 System.out.println(sum);
     }
	}

}
