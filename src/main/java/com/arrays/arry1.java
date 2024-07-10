package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arry1 {
	public static void main(String[] args) { //Taking inputs and printing elements in array
		System.out.println("Enter number of elements: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Enter elements in array: \n");
		int ele[] = new int[n];
		for(int i=0;i<n;i++)
		{
			 ele[i] = sc.nextInt();
			
		}
		System.out.print(Arrays.toString(ele));
	}

}
