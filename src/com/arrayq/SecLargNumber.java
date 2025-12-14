package com.arrayq;

public class SecLargNumber {
	
   
	public int secLargestNum(int arr[]) {
		int min=arr[0];
		int sec=0;
		for(int i=1;i<=arr.length-1;i++) {
			if(min < arr[i]) {
				sec=min;
				min=arr[i];	
			}
			else if (arr[i] > sec && arr[i] != min) {
	            sec = arr[i];
	        }
		}
		return sec;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SecLargNumber slc=new SecLargNumber();
			int arr[]= {5,1,4,6};
		System.out.println(slc.secLargestNum(arr));

	}

}
