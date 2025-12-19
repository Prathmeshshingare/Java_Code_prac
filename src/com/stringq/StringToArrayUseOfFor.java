package com.stringq;

public class StringToArrayUseOfFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		
		char[] c=new char[s.length()];
		
		for(int i=0;i<=s.length()-1;i++) {
			c[i]=s.charAt(i);
		}
		
		for(char cc:c) {
			System.out.print(cc+"  ");
		}

	}

}
