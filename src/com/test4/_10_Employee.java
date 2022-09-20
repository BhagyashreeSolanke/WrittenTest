package com.test4;

import java.util.Scanner;

public class _10_Employee {

	public static void main(String[] args) {
//	10.	Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then
//		using following rules print their place of service.
//		if employee is female, then she will work only in urban areas.
//		if employee is a male and age is in between 20 to 40 then he may work in anywhere
//		if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
//		And any other input of age should print "ERROR".

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your\nage: \nGender (M or F): \nMarital Status (y or n): ");
     int age=sc.nextInt();
     char gdr=sc.next().charAt(0);
     char mrtl=sc.next().charAt(0);
     if((gdr=='F'|| gdr=='f') && (mrtl=='y' || mrtl =='n')){
    	 System.out.println("Work only in urban areas.");
     }else if((gdr=='M' || gdr=='m') && (mrtl=='y' || mrtl =='n')){
    	 if(age>=20 && age<=40) {
    		 System.out.println("Can work anywhere.");    	    	
    	 }else if (age>40 && age<60)
    	 System.out.println("Work only in urban areas.");
    	 }  else {
    		 System.out.println("ERROR");
    	 }
     
	}

}
