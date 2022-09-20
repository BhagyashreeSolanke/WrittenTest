package com.test2;

public class Pattern1 {

	public static void main(String[] args) {
		/*WAP to print following pattern. [1M]
                   1
	             2 2 2
               3 3 3 3 3
             4 4 4 4 4 4 4   */
		
		int k=0;
		for(int i=1;i<=4;++i,k=0) {
			for(int j=1;j<=4-i;++j) {
				System.out.print(" ");
				
			}while(k!=2*i-1) {
				System.out.print(i);
				++k;
			}
			System.out.println();
		}



	}

}
