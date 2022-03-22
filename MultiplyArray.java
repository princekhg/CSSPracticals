package CodeSetBeginners;

import java.util.Scanner;

public class MultiplyArray {
private int mat1[][];
private int mat2[][];
private int multArray[][];
int r1,c1,r2,c2;
private Scanner scr=new Scanner(System.in);

// method to read the array
private void read() {
	System.out.println("Enter total rows in array1");
	r1=scr.nextInt();
	System.out.println("Enter total columns in array1");
	c1=scr.nextInt();
	mat1=new int[r1][c1];
	System.out.println("Enter values in array1");
	 for(int i=0;i<r1;i++)
		 for(int j=0;j<c1;j++)
			 mat1[i][j]=scr.nextInt();
	System.out.println("Enter total rows in array2");
	r2=scr.nextInt();
	System.out.println("Enter total columns in array2");
	c2=scr.nextInt();
	mat2=new int[r2][c2];
	System.out.println("Enter values in array2");
	for(int i=0;i<r2;i++)
		 for(int j=0;j<c2;j++)
			 mat2[i][j]=scr.nextInt();
	
}

// method to multiply the array...
private boolean multiply() {
	if(r1!=c2)
	{
		return false;
	}
	multArray=new int[r1][c2];
	for(int i=0;i<r1;i++)
		for(int j=0;j<c2;j++)
			for(int k=0;k<r2;k++)
			multArray[i][j]+=mat1[i][k]*mat2[k][j];
	return true;
}

private void display() {
	// TODO Auto-generated method stub
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c2;j++)
		{
			System.out.print(multArray[i][j]+" ");
		}
		System.out.println();
	}
	
}



public static void main(String args[])
{
	MultiplyArray ma=new MultiplyArray();
	ma.read();
	
	if(ma.multiply())
		ma.display();
	else
		System.out.println("Please make sure that first array row \n is equal to second array column");
		
}


}
