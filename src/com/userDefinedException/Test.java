package com.userDefinedException;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=0;
		int age1=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the age");
		age=scan.nextInt();
		System.out.println("Please enter one more age");
		age1=scan.nextInt();
		AgeCheck ac=new AgeCheck();
		AgeCheck ac1=new AgeCheck();
		
		try {
			ac.ageCheck(age);
		} catch (NegativeAgeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Exception occured "+e);
		}

		try {
			ac1.ageCheck(age1);
		} catch (NegativeAgeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Exception occured "+e);
		}
	}

}
