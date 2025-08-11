package com.api.test;

public class palindromString {

	public static void main (String[] args) {
		String s = "mom";
		String reverse ="" ;
		for (int i=s.length()-1;i>=0;i--)
		{
			reverse = reverse + s.charAt(i);
		}
		if (s.contains(reverse)) {
			System.out.print(reverse +" is a palindrom");
		}
		else {
			System.out.print(reverse +" is a not palindrom");
		}
		}

}
