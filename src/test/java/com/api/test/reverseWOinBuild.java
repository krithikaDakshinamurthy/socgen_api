package com.api.test;

public class reverseWOinBuild {
	
	public static void main (String[] args)
	{
		String str = "mom";
		String reverse = "";
		for (int i=str.length()-1;i>=0;i--)
		{
			reverse = reverse + str.charAt(i);
		}
		
		System.out.print(reverse);
	}

}
