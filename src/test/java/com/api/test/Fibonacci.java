package com.api.test;

public class Fibonacci {
	public static void main (String[]args) {
	int N =10;
	int n1=0, n2=1;
	System.out.print(n1 +","+ n2);
	for (int i=2;i<=N;i++)
	{
		int n3 = n1+n2;
		n1=n2;
		n2=n3;
		System.out.print("," +n3);
	}
	
	}
}
