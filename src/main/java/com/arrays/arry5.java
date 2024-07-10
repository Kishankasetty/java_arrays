package com.arrays;

import java.util.Arrays;

public class arry5 {
	public static void main(String[] args) {// To reverse an array
		int arr[]= {5,7,3,9,2,6,1,4};
		int n=arr.length-1;
		int temp;
		for(int i=0;i<arr.length/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[n-i];
			arr[n-i]=temp;
					
		}
		 System.out.print(Arrays.toString(arr));
		
		
		
		
		
	}

}
