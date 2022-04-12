package com.css.practical;

import java.util.Scanner;

public class MediumDate {
    int dd,mm,yy;
    public void input()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter Date");
        dd= scr.nextInt();
        System.out.println("Enter Month number");
        mm= scr.nextInt();
        System.out.println("Enter year");
        yy= scr.nextInt();
    }
    private String mediumDate()
    {
        String str[]={"Jan","feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String medium = dd+"-"+str[mm-1]+"-"+yy;
        return medium;
    }

    public static void main(String[] args) {
        MediumDate md=new MediumDate();
        md.input();
        System.out.println(md.mediumDate());
    }

}
