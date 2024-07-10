package com.arrays;

public class arry3 {
  public static void main(String[] args) { // To count number of even and odd elements in array 
	int arr[]= {5,7,3,9,2,6,1,4};
	
	int even=0,odd=0;
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
			even++;
		else
			odd++;
	}
	System.out.println("No.of Even "+even+"\n No.of Odd "+odd);

}
}
