package com.arrayq;

public class ElementAtEvenIndex {
	
	public void elementAtEvenIndex(int arr1[]) {
		for(int i=0;i<=arr1.length;i++) {
			if(i % 2 == 0) {
				System.out.println(arr1[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ElementAtEvenIndex eai=new ElementAtEvenIndex();
      int arr[]= {1,2,3,4,5,6,7,8,9};
      eai.elementAtEvenIndex(arr);
	}

}
