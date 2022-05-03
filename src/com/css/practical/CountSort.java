package com.css.practical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountSort {

    List<Integer> ls = new ArrayList<>();
    public  void input()
    {
        Scanner scr= new Scanner(System.in);
        int n=scr.nextInt();
        for(int i=0;i<n;i++)
            ls.add(scr.nextInt());
    }

    public List<Integer> returnCount() {
        int[] arr = new int[ls.size()];
        int[] countVal = new int[ls.size()];
        List<Integer> ls= new ArrayList<>();
        int j = 0;
        for (Integer i : ls) {
            arr[0] = i;
            ++j;
        }
        for(int i: arr)
            System.out.println(i);
        return ls;
    }

    public static void main(String[] args) {
        CountSort cs= new CountSort();
        cs.input();
        System.out.println(cs.returnCount());
    }
}
