package com.css.practical;

import java.util.Scanner;

public class FrequencyElements {
    int[] mat;
    public void input()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter length of the array");
        int size=scr.nextInt();
        mat=new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++)
            mat[i]=scr.nextInt();
    }
    public void frequencyElements()
    {
        int flag;
        for(int i=0;i<mat.length;i++)
        {
            flag=1;
            for(int j=i+1;j<mat.length;j++)
            {
                if(mat[i]==mat[j] && mat[i]!=-1) {
                    flag++;
                    mat[j]=-1;
                }
            }
            if(mat[i]!=-1)
            System.out.println(mat[i]+ " - "+flag);
        }
    }

    public static void main(String[] args) {
        FrequencyElements fe=new FrequencyElements();
        fe.input();
        fe.frequencyElements();
    }
}
