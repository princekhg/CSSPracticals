package com.css.practical;

import java.util.Scanner;

public class RemoveDuplicate {
    int[] mat=new int[5];
    int size=mat.length;
    public void input()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0;i<5;i++)
            mat[i]=scr.nextInt();
    }
    //function to remove duplicate elements
   public void removeDuplicate()
   {

       for(int i=0;i<size;i++)
       {
           for(int j=i+1;j<size;j++)
           {
               if(mat[i]==mat[j])
               {
                   for(int k=j;k<size-1;k++)
                       mat[k]=mat[k+1];
                   size--;
               }
           }
       }
   }
   // display the final array
    public void display()
    {
        for(int i=0;i<size;i++)
            System.out.print(mat[i]+" ");
    }

    public static void main(String[] args) {
        RemoveDuplicate rd=new RemoveDuplicate();
        rd.input();
        rd.removeDuplicate();
        rd.display();
    }

}
