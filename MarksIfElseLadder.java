package CodeSetBeginners;
import java.util.Scanner;
public class MarksIfElseLadder {
     int marks;
     
  // method to read marks from user
 	private void read() {
 		// TODO Auto-generated method stub
 		try
 		{
 			System.out.println("Enter Marks to check grade");
 			Scanner scr=new Scanner(System.in);
 			marks=Integer.parseInt(scr.nextLine());
 			scr.close();
 		}catch(Exception e)
 		{
 			e.getStackTrace();
 		}
 	}

     // method to check grade using if-else ladder construct
	private String checkGrade() {
		if(marks>79)
			return "Honours";
		else if(marks > 90)
			return "First Dicison";
		else if(marks>49)
			return "Second Division";
		else if(marks>39)
			return "Third Division";
		//else return "Fail";
		// not required as anyhow the default outcome is failure.
		return "Fail";
	}

	// method to display the results
	private void display() {
		read();
		System.out.println(checkGrade());
	}

	
	// main method to create objects and run
	public static void main(String args[])
	{
		MarksIfElseLadder ms=new MarksIfElseLadder();
		ms.display();
	}
	
}
