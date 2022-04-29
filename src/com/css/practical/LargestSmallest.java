package com.css.practical;

import java.util.Scanner;

public class LargestSmallest {
    String word;
    int length = 0;
    String[] arr;
    public void input()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the words");
        word=scr.nextLine();
    }

    public String maxString() {
        int len=0,temp=0,begin=0,end=0;
        String sub = null;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                len++;
                end=i;
            }
           else
            {
                if(len>temp) {
                    sub = word.substring(begin, end-1);
                    len = 0;
                    end=i;
                }
            }
    }
        return sub;
}

    public static void main(String[] args) {
       LargestSmallest ls=new LargestSmallest();
       ls.input();
       System.out.println("The maximum string is  - "+ls.maxString());
    }
}
