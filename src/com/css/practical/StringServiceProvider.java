package com.css.practical;
import java.util.Arrays;
import java.util.Scanner;

public class StringServiceProvider {
    static String str;
    static char ch;
    static char replCh;

    public static void read() {
        System.out.println("Enter the String you want to perform operations on");
        Scanner scr = new Scanner(System.in);
        str = scr.nextLine();
        System.out.println("Enter character to perform search");
        ch=scr.next().charAt(0);
        System.out.println("Enter character to replace the character with");
        replCh=scr.next().charAt(0);
    }

    public static String reverse() {

        char ch[] = str.toCharArray();
        char ch1[] = new char[ch.length];
        for (int i = ch.length - 1, k = 0; i >= 0; i--, k++)
            ch1[k] = ch[i];
        String str1= new String(ch1);
        return str1;
    }

    public static int linearSearch(char element) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == element) {
                return i;
            }
        }
        return -1;
    }

    // find certain character and replace in the given string;
    public static String searchReplace(char element, char replace) {
        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == element) {
               ch[i]=replace;
            }
            else
                ch[i]=str.charAt(i);
        }
        String str1=new String(ch);
        return str1;
    }
    public static void main(String args[])
    {
        read();
        if(linearSearch(ch)>-1)
            System.out.println("The character found at index -- " +linearSearch(ch));
        else
            System.out.println("Character Not Found");
        System.out.println(searchReplace(ch,replCh));
        System.out.println(reverse());
    }
}
