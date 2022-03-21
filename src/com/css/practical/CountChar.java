package com.css.practical;

import java.util.Scanner;


public class CountChar {
    String str;

    int vowels=0,conso=0;
    public void read()
    {
        // user input
        Scanner scr=new Scanner(System.in);
        str=scr.nextLine();
    }
    private void counVal()
    {
        char ch[]=str.toCharArray();
        for(char c:ch)
        {
            switch (c)
            {
                case 'A': case 'E': case 'a': case 'e': case 'i': case 'I': case 'o' : case 'O': case 'U': case 'u':
                    vowels++;
                    break;
                default :
                    conso++;
            }
        }
    }
  private void display()
  {
      System.out.println("Total Vowels  = "+vowels+ " total consosnants  - "+conso);
  }

    public static void main(String[] args) {
     CountChar cc=new CountChar();
     cc.read();
     cc.counVal();
     cc.display();
    }
}
