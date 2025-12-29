package com.InterviewAsk;

public class reverse {
		
		    public static void main(String[] args) {
		        String input = "java is nice lang";
		        String reverse = "";

		        for (int i = input.length() - 1; i >= 0; i--) {
		            reverse = reverse + input.charAt(i);
		        }

		        System.out.println(reverse);
		    }
		


	}


