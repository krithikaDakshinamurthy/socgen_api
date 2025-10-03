package com.api.test;

public class nonOccuranceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "gragr";
		boolean flag = true ;
		for(char i :  s.toCharArray())
		{
			if (s.indexOf(i)==s.lastIndexOf(i))
			{
			System.out.println("The non occrancee letter : " + i);
			System.out.println("Index of the letter " + s.indexOf(i));
			flag = false; 
			return;
		}
		}
		if (flag)
			System.out.print("No non occrance letter");

	}

}
