package com.api.test;

public class charOccuranceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="geeksforgeeks";
		char ch = 'k';
		int count =0;
		for (int i=0; i<=str.length()-1;i++)
		{
			if (str.charAt(i)==ch)
			{ 
				count++;
			}
		}
		System.out.println(count);
	}

}
