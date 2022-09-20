package com.test3;

public class Pattern3 {

	public static void main(String[] args) {
		/*	Single loop to print following pattern
		1
		22
		333
		4444
		55555*/
		int a=10;
		int b=1;
		int rim;
		for(int i=1;i<=5;i++)
		{
			b=b*10;
			rim=b/9;
			int j=rim*i;
		System.out.println(j);	
		}
	
	}
}

