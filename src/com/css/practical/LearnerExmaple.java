package com.css.practical;

import java.util.Map;
import java.util.Scanner;

public class LearnerExmaple {
  int n;
  final int MOD = 100000007;
  public void input()
  {
      Scanner scr=new Scanner(System.in);
      n=scr.nextInt();
  }
  public int maxBitonic()
  {
     return (int)(Math.pow(2,n-1)-2)%MOD;
  }
  public void display()
  {
      System.out.println(maxBitonic());
  }
    // execution of java program starts

    public static void main(String[] args) {
       LearnerExmaple le=new LearnerExmaple();
       le.input();
       le.display();
    }
}
