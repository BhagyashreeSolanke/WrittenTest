package com.test2;

public class Series {

	public static void main(String[] args) {
		// 2,12,36,80,150,252,----
		
		for(int j=1;j<=10;j++) {
			double result=(j*j*j)+(j*j);
			System.out.print((int)result+",");
		}

	}

}
