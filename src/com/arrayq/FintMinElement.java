package com.arrayq;

public class FintMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,9,5,7,1,2};
		int min=arr[0];
		
		for(int i=0;i<=arr.length-1;i++) {
			if(min > arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Minimun Elements of Array:"+min);

	}

}
