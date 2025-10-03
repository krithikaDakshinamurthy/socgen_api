package com.api.test;

import java.util.Arrays;

public class mergeAndSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr1[]= {10,20,12};
		 int arr2[] = {40,50,60};
		 
		 int a1 = arr1.length;
		 int a2 = arr2.length;
		 
		 int c1 = a1+a2;
		 
		 int[] c = new int[c1];
		 
		 for (int i=0;i<a1;i=i+1)
		 {
			 c[i] = arr1[i];
		 }
		 
		 for (int i=0;i<a2;i=i+1)
		 {
			 c[a1+i]=arr2[i];
		 }
		 
		 System.out.println(Arrays.toString(c));
	}

}
