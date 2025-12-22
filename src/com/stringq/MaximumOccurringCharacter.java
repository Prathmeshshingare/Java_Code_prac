package com.stringq;

public class MaximumOccurringCharacter {

    public static void main(String[] args) {

        String str = "success";
        char[] ch = str.toCharArray();

        char maxChar = ch[0];
        int maxCount = 0;

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == '\0') {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '\0';   // mark counted
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = ch[i];
            }
        }

        System.out.println("Maximum occurring character: " 
                            + maxChar + " count is : " + maxCount);
    }
}
