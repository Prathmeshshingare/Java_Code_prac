package com.arrayq;

public class RemoveDuplicate {
	
	public void removeDuplicate(int arr[]) {
		int dup[]=new int[arr.length];
		int j=0;
		dup[j++]=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i] !=arr [i-1]) {
				dup[j++]=arr[i];
			}
		}
		for(int i=0;i<=j-1;i++) {
			System.out.println(dup[i]);
		
	
		}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicate r=new RemoveDuplicate();
		int arr[] = {1,2,2,3,4,5,6,6,7,8};
		r.removeDuplicate(arr);
		}

	}


