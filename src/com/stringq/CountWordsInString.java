package com.stringq;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java is programing lang";
		
		int count=0;
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			
			if(arr[i] != ' ' && (i == 0 || arr[i - 1] == ' ')) {
				count++;
			}
		}
		System.out.println(count);

	}

}
