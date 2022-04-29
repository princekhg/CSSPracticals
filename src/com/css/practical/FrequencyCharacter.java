package com.css.practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* This program will take a sentence and then calculate
* the frequency of each character
* and print it one in each line
* */
public class FrequencyCharacter {

    public static void main(String[] args)throws IOException
    {
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length of the array");
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter length of the array");
        char[] ch = br.readLine().toCharArray();
        int [] arr=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(i==0)
            {
                if(ch[i] == 'L')
                {
                    arr[j]=2;
                    arr[j+1]=1;
                }
                if(ch[i] == 'R')
                {
                    arr[j]=1;
                    arr[j+1]=2;
                }
                if(ch[i] == '=')
                {
                    arr[j]=arr[j+1]=1;
                }
            }
            else if(ch[i] == 'L')
            {
                arr[j+1] = arr[j]-1;
            }
            else if(ch[i] == 'R')
            {
                arr[j+1] = arr[j]+1;
            }
            else if(ch[i] == '=')
            {
                arr[j+1] = arr[j];
            }
            ++j;
        }
        for(int i:arr)
            System.out.print(i+" ");
    }
}
