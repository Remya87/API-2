package Maincode;

import java.util.Scanner;

public class sumadddigit {
	
	static int number;
	int digit;
	int sum = 0; 
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
		 sumadddigit ex = new sumadddigit();
		int a=ex.sumMethod(100);
		System.out.println(a);
		
			}

	public int sumMethod(int number) {

		 
		while(number > 0)  
		{  
		   
		digit = number % 10;  
		
		sum = sum + digit;  
		
		number = number / 10;  
		}  
		
		return sum;
		
	}

	
	

             
	}  
			 




