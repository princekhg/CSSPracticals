package com.css.practical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class FindUnique {
    ArrayList<Integer> al = new ArrayList<>();
    public void input()
    {
        Scanner scr=new Scanner(System.in);
        int len = scr.nextInt();
        for(int i=0;i<len;i++)
            al.add(scr.nextInt());
    }
    // get all the unique elements that's what
    public void unique()
    {
        int num;
        HashSet<Integer> hset = new HashSet<>(al);
        for(Integer i: hset)
            System.out.println(i);
        List<Integer> ls = new ArrayList<>(hset);

    }
    public static void main(String[] args) {
      FindUnique fu = new FindUnique();
      fu.input();
      fu.unique();
    }
}
