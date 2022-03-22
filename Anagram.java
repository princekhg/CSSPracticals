package CompetCoding;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	String str1,str2;
	private Scanner scr=new Scanner(System.in);
	// read method
	private void read()
	{
		System.out.println("Enter string1");
		str1=scr.nextLine();
		System.out.println("Enter string2");
		str2=scr.nextLine();
	}
	//compare and check for the anagrams
	private boolean isAnagram()
	{
		boolean flag=true;
		char ch1[]=str1.toLowerCase().toCharArray();
		char ch2[]=str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
			 flag=false;
			 return flag;
			}
		}
		return true;
	}
	// main deriver method
	public static void main(String args[])
	{
		Anagram ag=new Anagram();
		ag.read();
		
		
		if(ag.isAnagram())
			System.out.println("The Strings are anagram");
		else
			System.out.println("The Strings are not an anagram");
		
	}
}
