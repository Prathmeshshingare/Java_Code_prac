package com.arrayq;

public class MoveZeroToEnd {
	
	public void moveZeroToEnd(int arr[]) {
		
	int index=0;
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i] != 0) {
			arr[index++] = arr[i];
		}
	}

	while (index < arr.length) {
		arr[index++] = 0;
	}
	for(int i=0;i<=arr.length-1;i++) {
		System.out.println(arr[i]);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZeroToEnd mz=new MoveZeroToEnd();
		int arr[]= {1,0,2,3,0,4,5,6};
		mz.moveZeroToEnd(arr);

}
}