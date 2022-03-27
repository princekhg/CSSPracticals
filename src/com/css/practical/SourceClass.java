package com.css.practical;

import java.util.ArrayList;
import java.util.Scanner;

public class SourceClass {
    public static void main(String[] args) {
    Toggle tg=new Toggle();
    String str;
    Scanner scr=new Scanner(System.in);
    str=scr.nextLine();
    System.out.println(tg.toggle(str));


        Implementation imp=new Implementation();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(73);
        list.add(24);
        list.add(10);
        list.add(15);
        System.out.println(imp.sumOfElements(list));
        System.out.println(imp.getElementAtIndex(list,2));
        System.out.println(imp.splitreverse(list));
    }
}
