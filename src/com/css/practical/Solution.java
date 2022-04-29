package com.css.practical;

import java.io.*;
import java.util.*;

public class Solution {
    int[] arr;
    int n;
    int[] out;
    public void input()
    {
        Scanner scr=new Scanner(System.in);
        n=scr.nextInt();
        arr=new int[n];
        out = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scr.nextInt();
    }

    public void iterateCheck() {
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                if (arr[i] > arr[1])
                    out[i] = arr[i];
                else
                    out[i] = arr[1];
            } else {
                if (arr[i] > arr[i+1])
                    out[i] = arr[i];
                else
                    out[i] = arr[i+1];
            }
        }
    }
    public void display()
    {
        for(int i: out)
        System.out.print(i+" ");
    }

    public static void main(String[] args) {
        Solution sn=new Solution();
        sn.input();
        sn.display();
    }
}