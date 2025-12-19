package com.stringq;

public class SentenceToWordArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is Best Lang";
		String[] word=s.split(" ");
		
		for(String ss:word) {
			System.out.println(ss+" ");
		}

	}

}
