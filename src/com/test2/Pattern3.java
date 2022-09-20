package com.test2;

public class Pattern3 {

	public static void main(String[] args) {
		/* WAP to print following pattern. [1M]
	         1 2 3 4 5
	           1 2 3 4
	             1 2 3
	               1 2
	                 1     */
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("");
				
			}
			for(int j=i;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}


	}

}
