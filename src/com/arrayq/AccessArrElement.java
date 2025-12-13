package com.arrayq;

public class AccessArrElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key=8;
		int[] arr= {10,20,5,7,8,34};
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i] == key)
				System.out.println("It is Present at index of "+i);
		}
		

	}

}
