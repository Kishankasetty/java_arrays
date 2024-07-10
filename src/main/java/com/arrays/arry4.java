package com.arrays;

public class arry4 {
	public static void main(String[] args) { // To print all negative elements in array
		int arr[]= {5,-7,3,-9,2,6,1,-4};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)
				System.out.print(arr[i]+" ");
		}
	}

}
