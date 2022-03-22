package CodeSetBeginners;
import java.io.*;
import java.util.Arrays;
public class TwoMax {
	private String arr[];
	private int n,first,sec;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	//method to read the array and create array using the length of the array
	private void read()
	{
		try
		{
		System.out.print("Enter length of array \n" );
		n=Integer.parseInt(br.readLine());
		arr=new String[n];
		for(int i=0;i<n;i++)
			arr[i]=br.readLine();
		}catch(Exception e) {
			System.out.print(e);
		}
	}
	//method to sort the elements in ascending order using Arrays package method 
	private void sortArray()
	{
		Arrays.sort(arr);
	}
	
	private void displayMax() {
		first=Integer.parseInt(arr[n-1]);
		sec=Integer.parseInt(arr[n-2]);
			System.out.print(first + ", " + sec + " are two Maximum numbers in given Array");
	}

	public static void main(String args[])throws Exception
	{
	   	TwoMax tm =new TwoMax();
		tm.read();
		tm.sortArray();
		tm.displayMax();
	}

	
}
