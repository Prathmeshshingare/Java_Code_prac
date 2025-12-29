package com.InterviewAsk;

public class SecMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stubarr
		
		int arr[]= {4,3,8,6,9,7};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}

		System.out.println(max);
	}

}
