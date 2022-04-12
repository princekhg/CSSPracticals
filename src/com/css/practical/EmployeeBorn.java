package com.css.practical;

import java.util.Scanner;

public class EmployeeBorn {
    int[] year;
    int[] born;
    public void input()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter length of the array");
        int size=scr.nextInt();
        year=new int[size];
        born=new int[size];
        for(int i=0;i<size;i++) {
            System.out.println("Enter year");
            year[i]= scr.nextInt();
            System.out.println("Enter no of employee born");
            born[i]= scr.nextInt();
        }
    }

    //method to print year in which no employee is born
    public void noEmployee()
    {
        int count=0;
        for(int i=0;i<born.length;i++)
            if(born[i]==0)
            {
                ++count;
                System.out.println("Year with 0 employees born " +year[i]);
            }
        System.out.println("Total number of years with 0 employees born - "+count);
    }

    // to print the total employees above 60
    public void seniorEmployee()
    {
        int count=0;
        for(int i=0;i<born.length;i++)
            if(2004-year[i]>=60)
                count=count+born[i];
        System.out.println("The 60 or above number of employees -- "+count);
    }

    public static void main(String[] args) {
        EmployeeBorn eb=new EmployeeBorn();
        eb.input();
        eb.noEmployee();
        eb.seniorEmployee();
    }

}
