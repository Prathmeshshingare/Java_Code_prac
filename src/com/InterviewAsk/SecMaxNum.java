package com.InterviewAsk;

public class SecMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,5,8,7,9};
		int max=arr[0];
		int sec=max;
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				sec=max;
				max=arr[i];
				
			}
		}
      System.out.println(sec);
	}

}
