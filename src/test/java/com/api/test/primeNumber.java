package com.api.test;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 32;
		for (int i=2;i<num;i++)
		{
			if(num % i ==0)
			{
				System.out.println(num + " is not a prime number");
				return;
			}
		}
		System.out.println(num + " is a prime number");
	}

}
