package com.arrayq;

public class CountEvenOdd {
	
	public void countEvenOdd(int arr[]) {
		int Evenc=0;
		int Oddc=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i] % 2==0)
				Evenc++;
			else
				Oddc++;
		}
		System.out.println("Count of Even Elemnets:"+Evenc);
		System.out.println("Count of Odd Elemnets:"+Oddc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountEvenOdd ceo=new CountEvenOdd();
		int arr[]= {1,2,3,4,5,6,7,8,9};
		ceo.countEvenOdd(arr);

	}

}
