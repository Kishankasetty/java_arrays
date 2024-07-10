package com.demo;

public class half_char {
  public static void main(String[] args) {
	int n=5;
	for(int i=0;i<n;i++)
	{
		int a=1;
		for(int j=0;j<=i;j++)
		{
			if(j%2 ==0)
			{
				System.out.print("1");
			}
			else
			{
				System.out.print((char)(64+a++));
			}
		}
		System.out.println();
	}
}
}
