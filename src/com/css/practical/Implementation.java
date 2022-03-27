package com.css.practical;

import java.util.ArrayList;

public class Implementation {
    int sumOfElements(ArrayList<Integer> list)
    {
        int sum=0;
        for(int i: list)
            sum+=i;
        return sum;
    }
    int getElementAtIndex(ArrayList<Integer> list, int index)
    {
        if(index < 0)
            return -1;
        return list.get(index);
    }
    ArrayList<Integer> splitreverse(ArrayList<Integer> list)
    {
        ArrayList<Integer> left=new ArrayList<>();
        ArrayList<Integer> right=new ArrayList<>();
        ArrayList<Integer> fina=new ArrayList<>();
        int len=list.size();
        if(len%2 == 0)
        {
            for(int i=len/2-1;i>=0;i--)
                left.add(list.get(i));
            for(int i=list.size()-1;i>len%2+1;i--)
                right.add(list.get(i));
        }
        else {
            for (int i = len / 2; i >= 0; i--)
                left.add(list.get(i));
            for (int i = list.size() - 1; i > len % 2+1; i--)
                right.add(list.get(i));
        }
       for(int i:left)
           fina.add(i);
       for(int i:right)
           fina.add(i);

       return fina;
     }
}
