package com.api.test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class removeStringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "moon boon soon";
		String unquie = Arrays.asList(str.split("")).stream().distinct().collect(Collectors.joining());
		System.out.println(unquie);

	}

}
