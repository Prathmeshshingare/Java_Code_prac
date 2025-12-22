package com.stringq;

public class ReplaceSpacesWithSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "java is good";
		String res=" ";
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(ch==' ') {
				res=res+'@';
			}
			else {
				res=res+ch;
			}
		}
    System.out.println(res);
	}

}
