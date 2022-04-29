package com.css.practical;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class MaxVal {

    int[][] marks;
    int[] sum;
    int[] avg;
    int m,n;

    public void input()
    {
        Scanner scr=new Scanner(System.in);
        m=scr.nextInt();
        n= scr.nextInt();
        marks=new int[m][n];
        sum=new int[m];
        avg=new int[m];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                marks[i][j]= scr.nextInt();
    }

    public void sum()
    {
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                sum[i] = sum[i] + marks[i][j];
            }
            avg[i]=sum[i]/n;
        }
    }

    public void sort()
    {
        for(int i=0;i<m;i++)
            Arrays.sort(marks[i]);
    }

    public void total()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(marks[i][j]<=avg[i]) {
                    sum[i] -= marks[i][j];
                    break;
                }
            }

        }
    }

    public void display() {
        for (int i = 0; i < m; i++) {
            System.out.print(sum[i] + " ");
                }

    }
    public static void main(String[] args) {
        MaxVal mv=new MaxVal();
        mv.input();
        mv.sum();
        mv.sort();
        mv.total();
        mv.display();
    }
}
