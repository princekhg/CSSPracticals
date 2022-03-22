package CompetCoding;

import java.util.Scanner;

public class ArrayCopy {
	
  private char array[];
  private char secArray[];
  private Scanner scr=new Scanner(System.in);
  //method to rread the array
  private void read()
  {
	  int len;
	  System.out.println("Enter length of array");
	  // define
	  len=scr.nextInt();
	  array=new char[len];
	  secArray=new char[len];
	  System.out.println("Enter array elements");
	  for(int i=0;i<len;i++)
		  array[i]=scr.next().charAt(0);
  }
  
  // create a copy of the array
  private void copyArray()
  {
	  int k=0;
	  for(char ch:array)
	  {
		  secArray[k]=ch;
		  ++k;
	  }
  }
  // method to display the copied array
  private void display()
  {
	  for(char ch: secArray)
		  System.out.print(ch+" ");
		  
  }
  public static void main(String args[])
	{
		ArrayCopy ac=new ArrayCopy();
		ac.read();
		// manual removal method is used.....
		ac.copyArray();
		// use the predefined method
		//sw.removeWhite();
		ac.display();
	}
}
