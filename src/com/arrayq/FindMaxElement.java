package com.arrayq;

public class FindMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,2,3,5,6,8,4};
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(max < arr[i])
				max=arr[i];
		}
		
System.out.println("Max element of arrat:"+max);
	}

}
