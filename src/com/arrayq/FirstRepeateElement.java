package com.arrayq;

public class FirstRepeateElement {
	
	void firstRepeateElement(int arr[]) {
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("first Reapeating element:"+arr[i]);
					return;//it will stop code run after one is found
					
				}
			}
		
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstRepeateElement fr=new FirstRepeateElement();
		int arr[]= {1,2,2,3,4,5,5,6,7};
		fr.firstRepeateElement(arr);

	}

}
