package com.api.test;

import java.util.Arrays;

public class removeDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {30,10,20,20,30,40,20};
		int [] unquie = Arrays.stream(arr).distinct().toArray();
		System.out.print(Arrays.toString(unquie));
		
		}

	}


