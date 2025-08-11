package com.api.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Practise {

	public static void main(String[] args) {
	
		 int start = 2 , last =100; 
	        int sum =0;
	        for (int i=start;i<=last;i++)
	        {
	            int check =0;
	            for (int j=1;j<=i;j++)
	            {
	                if (i%j ==0)
	                {
	                    check++;
	                }
	            }
	            if (check==2)
	            {
	                System.out.println(i);
	                sum +=i;
	            }
	        }
	        System.out.println("Average of prime : "+ sum);
	    }
	    }

