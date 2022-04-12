package com.css.practical;

import java.util.Scanner;

public class StringCpmare {
    String str, user_str;
    int count=0;

    public void input() {
        Scanner scr = new Scanner(System.in);
        str = scr.nextLine();
        user_str = scr.nextLine();
    }

    public boolean check() {
        if (str.equals(user_str))
            return true;
        return false;
    }

    public int count()
    {
        if(check())
            count++;
        return count;
    }

    public static void main(String[] args) {
        StringCpmare stcmp = new StringCpmare();
        stcmp.input();
        System.out.println(stcmp.count());
    }
}
