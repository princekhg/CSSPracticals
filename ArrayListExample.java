package CodeSetBeginners;
import java.util.*;
public class ArrayListExample {
	List<String> fruits=new ArrayList<>();
	public static void main(String args[])
	{
		ArrayListExample ar=new ArrayListExample();
		ar.read();
		ar.display();
		
	}

	// method to display the contents of arraylist
	private void display() {
		// TODO Auto-generated method stub
	for(String fruit:fruits)
		System.out.print(fruit+" ");
	}

	// method to read the elements in arrrayList
	private void read() {
		// TODO Auto-generated method stub
		int n;
		try
		{
			Scanner scr=new Scanner(System.in);
			System.out.println("Enter total number of fruits in arraylist");
			n=scr.nextInt();
			System.out.println("Enter fruits list");
			for(int i=0;i<n;i++)
				fruits.add(scr.nextLine());
			scr.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
		
	}
	
}
