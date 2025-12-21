package com.stringq;

public class RemoveRepeateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);

		    if (result.indexOf(ch) == -1) {
		        result = result + ch;
		    }
		}

		System.out.println(result);


	}

}
