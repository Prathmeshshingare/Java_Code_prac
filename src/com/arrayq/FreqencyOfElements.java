package com.arrayq;

public class FreqencyOfElements {
	
	void feqOfElement(int arr[]) {

		for(int i=0;i<=arr.length-1;i++) {
			
			if(arr[i]==-1) {
				continue;// here we are skip the number who is sets as -1 
			}
			int c=1;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i] ==arr[j]) {
					c++;
					arr[j]=-1;//Here we set number who already counted 
				}
			}
		
				System.out.println(arr[i]+" element count "+c);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreqencyOfElements fe=new FreqencyOfElements();
		int arr[]= {1,2,2,3,4,5,6,6,6};
		fe.feqOfElement(arr);

	}

}
