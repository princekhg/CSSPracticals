package com.css.practical;

import java.util.Scanner;
public class Solution
{
    long num;
    static int T;
    Scanner scr=new Scanner(System.in);
    public void readTest()
    {
        T=scr.nextInt();
    }
    public void read()
    {
        num=scr.nextLong();
    }
    public long smallNum()
    {
        long sum=0,temp=num;
        while(num!=0)
        {
            long rem=num%10;
            num/=10;
            sum+=rem;
        }
        long rem=sum%9;
        long dig=9-rem;

        while(temp!=0)
        {

        }
    }
    public static void main(String[] args) {
        int x=0;
        Solution s=new Solution();
        s.readTest();
        while (T-- != 0)
        {
            s.read();
            System.out.println("Case #"+x+": "+s.smallNum());
            x++;
        }

    }
}