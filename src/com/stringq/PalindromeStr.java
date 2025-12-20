package com.stringq;

public class PalindromeStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="wow";
		
		String temp=str;
		String rev="";
		for(int i=temp.length()-1;i>=0;i--) {
			rev=rev+temp.charAt(i);
		}
		//System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}

	}

}
