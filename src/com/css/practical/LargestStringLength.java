package com.css.practical;

import java.util.Scanner;

public class LargestStringLength {
    String word;
    public void input()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the words");
        word=scr.nextLine();
    }
    public int length()
    {
        int len=0,temp=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)!=' ')
            {
                temp++;
                }
            else{
                if(len<temp)
                  len=temp;
                temp=0;
            }
        }
        if(len<temp)
            len=temp;
        return len;
    }

    public static void main(String[] args) {
        LargestStringLength lsl=new LargestStringLength();
        lsl.input();
        System.out.println("The largest word length is  -- "+lsl.length());
    }
}
