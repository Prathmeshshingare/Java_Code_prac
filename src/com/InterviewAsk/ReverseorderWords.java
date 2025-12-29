package com.InterviewAsk;

public class ReverseorderWords {
	    public static void main(String[] args) {
	        String input = "java is nice lang";
	        String[] words = input.split(" ");

	        for (int i = words.length - 1; i >= 0; i--) {
	            System.out.print(words[i] + " ");
	        }
	    }
}
