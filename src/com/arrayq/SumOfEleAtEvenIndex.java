package com.arrayq;

public class SumOfEleAtEvenIndex {
	
	public int sumOfEle(int arr[]) {
	  int sum=0;
	  for(int i=0;i<=arr.length;i++) {
		  if( i % 2 == 0) {
			  sum=sum+arr[i];
		  }
	  }
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfEleAtEvenIndex si=new SumOfEleAtEvenIndex();
		int ar[]= {1,2,3,4,5,6,7,8,9};
		
		System.out.println("sum of Elements aat Even Poaition:"+si.sumOfEle(ar));

	}

}
