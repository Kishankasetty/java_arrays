package com.demo;

public class Triangel {
	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=(2*n)-1;j++)
			{
				
			if(i+j<=n+1 || j-i>n-2)
				System.out.print(" ");
			else
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
