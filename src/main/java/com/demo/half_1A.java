package com.demo;

public class half_1A {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j%2 == 0)
				{
					System.out.print("1");
				}
				else
					System.out.print((char)(n+60));
			}
			System.out.println();
		}
	}

}
