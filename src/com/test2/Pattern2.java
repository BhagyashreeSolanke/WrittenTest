package com.test2;

public class Pattern2 {

	public static void main(String[] args) {
		/* .WAP to print following pattern. [1M]
	
		* * * * *
		* * * *
		* * *
		* *
		*               */
		
		for(int i=5;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*"+"");
			}
			System.out.println();
		}


	}

}
