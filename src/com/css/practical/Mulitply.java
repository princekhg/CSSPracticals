package com.css.practical;

import java.util.Arrays;

public class Mulitply {
    int[] arr={1,2,3,4,5,6,7,8,9,10};
    public int multiply()
    {
        Arrays.sort(arr);
        return (arr[1]*arr[arr.length-1]);
    }

    public static void main(String[] args) {
        Mulitply mn=new Mulitply();
        System.out.println(mn.multiply());
    }
}
