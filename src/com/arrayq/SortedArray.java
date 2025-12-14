package com.arrayq;

public class SortedArray {
	
	public boolean isSorted(int arr[]) {
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		SortedArray sa=new SortedArray();
		System.out.println(sa.isSorted(arr));

	}

}
