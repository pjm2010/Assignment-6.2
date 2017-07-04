package com.userDefinedException;

public class AgeCheck {

	public void ageCheck(int x) throws NegativeAgeException{
		if(x<0){
			throw new NegativeAgeException("Not a valid Age");
		}
		else{
			System.out.println("Valid Age");
		}
				
	}
	
}
