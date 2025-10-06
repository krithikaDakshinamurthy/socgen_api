package com.api.test;

public class seccondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50,60,90,15};
		int temp ;
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
					}	
			}
			System.out.println(arr[i]);
		}
		System.out.println(arr[arr.length-2]);
	}

}
