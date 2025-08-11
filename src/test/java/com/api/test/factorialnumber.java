package com.api.test;

public class factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =5,i=1;
		long factorial =1;
		while (i<=num)
		{
			factorial *=i;
			i++;
		}
		System.out.print("factorial of "+ num +" is " + factorial);
		}

}
