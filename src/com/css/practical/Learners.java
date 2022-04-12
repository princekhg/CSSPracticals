package com.css.practical;

import java.util.ArrayList;
import java.util.List;

public class Learners {

    public static void main(String[] args) {
        int[] arr=new int[]{10,12,13,14};
        ArrayList<Integer> ele=new ArrayList<>();
        ele.add(10);
        ele.add(12);
        for(int i:ele)
            System.out.println(i);

        for(int i:arr)
            System.out.println(i);
    }
}
