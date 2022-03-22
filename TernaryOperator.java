package CodeSetBeginners;

import java.util.Scanner;

/*This program will calculate the weekly salary
 of a salesman selling domestic product depending on the formula
 salary = 4x+100,  x< 40
        =300, x=40
        =4.5x + 150, x>40
  use of ternary operator with if else construct is also shown
  */

public class TernaryOperator {

	int noOfProduct;
	
	private void display() {
	    read();
	    System.out.println("Total salary earned this week by salesman is = " +salary());
	}

	//method to read the no. of products sold a week.
	private void read() {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Enter number of products sold in a week");
			Scanner scr=new Scanner(System.in);
			noOfProduct=scr.nextInt();
			scr.close();
			
		}catch(Exception e) {
			System.out.println("I/O Error");
		}
	}

	// method to calculate the salary
	private double salary()
	{
		/* if(noOfProduct <= 40)
		   if(noOfProduct = 40)
		     sal = 4*noOfProduct + 100;
		   else
		      sal=300;
		   else
		      sal=4.5*noOfProduct + 150;
		 *
		 * The equivalent of if else ladder*/
		
		double sal = (noOfProduct!= 40)? ((noOfProduct<40) ? (4*noOfProduct + 100) : (4.5*noOfProduct + 150)): 300 ;
	    return sal;
	}
	
	//main method
	public static void main(String[] args) {
		TernaryOperator to=new TernaryOperator();
		to.display();
		
	}
}	
