package com.test4;

public class _3_Pattern {

	public static void main(String[] args) {
		int i, j, c, N;

		N = 5;
		c = 1;
		for (i = 1; i <= N; i++)
		{
		for (j = 1; j <= i; j++)
		{
		System.out.print(c + " ");
		c++;
		}
		System.out.println("");
		}

	}

}
