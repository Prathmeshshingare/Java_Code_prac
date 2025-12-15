package com.arrayq;

public class RotateArray {
	public void rotateArray(int arr[]){
	int start=0;
	int end=arr.length-1;
	while(start < end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
   for(int a:arr) {
	   System.out.println(a);
   }
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArray ra=new RotateArray();
		int arr[]= {1,2,3,4,5,6,8};
		ra.rotateArray(arr);
		

	}

}
