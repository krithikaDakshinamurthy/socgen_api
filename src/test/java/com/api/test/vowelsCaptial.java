package com.api.test;

public class vowelsCaptial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "icecream";
		String vowles = str.replaceAll("a", "A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o","O").replaceAll("u","U");
		System.out.print("Vowels capital : " + vowles);
				
	
	}

}
