package com.api.test;

public class duplicateWordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "this is good today this is good";
		String[] arr = s.split(" ");
		for (int i=0;i<arr.length;i++)
		{
			int count =1; 
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[j].equals(arr[i]) && arr[i]!="0")
{
	count++;
	arr[j]="0";
}
			}
			if(count>1) {
				System.out.println(arr[i] + ":" + count);
			}
		}
	}

}
