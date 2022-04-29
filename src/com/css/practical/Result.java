package com.css.practical;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static void plusMinus(List<Integer> arr) {
        int plus,min,zero;
        int[] sum = new int[arr.size()];
        double[] ratio = new double[arr.size()];
        plus=min=zero=0;
        for(int l: arr)
        {
            if(l>0)
            {
                plus++;
                sum[2]+=l;
            }
            else if(l<0)
            {
                min++;
                sum[1]+=l;
            }
            else
            {
                zero++;
                sum[0]+=l;
            }
        }

        ratio[0] = (double)sum[0]/zero;
        ratio[1] = (double)sum[1]/min;
        ratio[2] = (double)sum[2]/plus;
        for(double i: ratio)
            System.out.println(i);
        //create a method for input and call it that's it

    }

    public static void main(String[] args) {
        Result rs=new Result();
    }

}

