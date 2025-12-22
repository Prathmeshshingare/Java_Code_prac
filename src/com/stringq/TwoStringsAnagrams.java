package com.stringq;

import java.util.Arrays;

public class TwoStringsAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="silent";
		String str1="listen";
		
		if(str.length() != str1.length() ) {
			System.out.println("String are not Anagram");
		}
		
		char[] ch=str.toCharArray();
		char[] ch1=str1.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		if(Arrays.equals(ch,ch1)) {
			System.out.println("String are  Anagram");
		}
		else
			System.out.println("String are  not Anagram.....");

	}

}
