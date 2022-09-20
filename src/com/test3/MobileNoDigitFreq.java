package com.test3;

import java.util.Scanner;

public class MobileNoDigitFreq {
	public static void main(String[] args) {
		//1. WAP to accept mobile number and count frequency of digit?

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your mobile number : ");
		long num=sc.nextLong();
		
	  //int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c0=0;
		
		/*while(num>0)
		{
			int rim=(int) (num%10);
			switch(rim) {
			case 1:if(rim==1)
				   c1++;
			break;
			case 2:if(rim==2)
				c2++;
			break;
			case 3:if(rim==3)
				c3++;
			break;
			case 4:if(rim==4)
				c4++;
			break;
			case 5:if(rim==5)
				c5++;
			break;
			case 6:if(rim==6)
				c6++;
			break;
			case 7:if(rim==7)
				c7++;
			break;
			case 8:if(rim==8)
				c8++;
			break;
			case 9:if(rim==9)
				c9++;			
			break;
			default:if(rim==0)
				c0++;		
			break;
			}
			
			num=num/10;
			System.out.println("Frequency of "+"\n 0 = "+c0+"\n 1 = "+c1+"\n 2 = "+c2+"\n 3 = "+c3+"\n 4 = "+c4+"\n 5 = "+c5+"\n 6 = "+c6+"\n 7 = "+c7+"\n 8 = "+c8+"\n 9 = "+c9);

		}*/
		   
		   
		   long copy=num;
	       long rim;
			for(int i=0;i<=9;i++)
			{
				num=copy;
				int count=0;
				while(num>0) {
					 rim=num%10;
					if(i==rim)
					{
						count++;						
					}
					num=num/10;		
				}			
				if(count>0){				
					System.out.println("Frequency of "+i+"="+count);
        			}
				}
	    }

}
