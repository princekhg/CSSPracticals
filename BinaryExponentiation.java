package CompetCoding;
import java.util.Scanner;
public class BinaryExponentiation {
	
	private int a,b,c;
	private Scanner scr=new Scanner(System.in);
	private void read()
	{
		System.out.println("Enter first number");
		a=scr.nextInt();
		System.out.println("Enter first number");
		b=scr.nextInt();
		System.out.println("Enter first number");
		c=scr.nextInt();
	}
	
	// method to find the power at O(log n) of any value.
	// x^n mod m to be found
	 private long binPow(long a, long b, long m) {
	    a %= m;
	    long res = 1;
	    while (b > 0) {
	        if ((b & 1)>=1)
	            res = res * a % m;
	        a = a * a % m;
	        b >>= 1;
	    }
	    return res;
	}
	
	 private void display()
	 {
		 System.out.println(binPow(a,b,c));
	 }
	public static void main(String args[])
	{
         BinaryExponentiation be=new BinaryExponentiation();
         be.read();
         be.display();
	}

}
