package com.stringq;

public class NumberOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="java";
		
		char[] c=new char[s.length()];
		
		for(int i=0;i<=s.length()-1;i++) {
			c[i]=s.charAt(i);
		}
		int count=0;
		for(int i=0;i<=c.length-1;i++) {
			count++;
		}
        System.out.println("Number of Characters :"+count);
	}

}
