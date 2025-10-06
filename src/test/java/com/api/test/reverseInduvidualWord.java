package com.api.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//import groovyjarjarantlr.collections.List;

public class reverseInduvidualWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "This is new try";
		String s1 = "";
		String [] words = s.split(" ");
		for (String word : words )
		{
			String revWord = "";
			for (int i=word.length()-1;i>=0;i--)
			{
				revWord = revWord + word.charAt(i);
			}
			s1 = s1 + revWord + " ";
		}
	  	     System.out.println(s1);
	  }
	}

