package CompetCoding;

import java.util.Arrays;
import java.util.Scanner;

public class StringWhiteSpace {
	
	String str;
    private Scanner scr=new Scanner(System.in);
	private void read()
	{
		System.out.println("Enter string");
		str=scr.nextLine();
	}
	//method to remove the whitespace
	private void removeWhite()
	{
		str=str.replaceAll("\\s", "");
	}
	// remove spaces manual
	private void remove()
	{
		char ch1[]=new char[str.length()];
		char ch[]=str.toCharArray();
		int k=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ' )
				continue;
			else
			{
				ch1[k]=ch[i];
				++k;
			}
		}
		StringBuilder build=new StringBuilder();
		for(char ch2: ch1)
			build.append(ch2);
		str=build.toString().trim();
	}
	
	
	private void display()
	{
		System.out.println(str);
	}
	public static void main(String args[])
	{
		StringWhiteSpace sw=new StringWhiteSpace();
		sw.read();
		// manual removal method is used.....
		sw.remove();
		// use the predefined method
		//sw.removeWhite();
		sw.display();
	}

}
