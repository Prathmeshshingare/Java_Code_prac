package com.arrayq;

public class SumPair {
//sum of two elements equal to sum
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7};
		int sum=9;
		for(int i=1;i<=arr.length-1;i++) {
			for(int j=1;j<=arr.length-1;j++) {
				if((arr[i] + arr[j]) == sum) {
					System.out.println(arr[i] +" : "+arr[j]);
				}
			}
		}

	}

}
