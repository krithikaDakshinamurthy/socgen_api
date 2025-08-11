package com.api.test;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 987654321; 
		int reverse = 0; 
		 while (num!=0)
		 {
			 int reminder = num % 10 ; 
			 reverse = reverse * 10 + reminder ; 
			 num = num /10 ; 
		 }
		 System.out.println(reverse);
	}

}
