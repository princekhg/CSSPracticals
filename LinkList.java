package CodeSetBeginners;

import java.util.*;
public class LinkList {

   private	LinkedList <String>names=new LinkedList<>();
   private Scanner scr=new Scanner(System.in);
	public void read()
	{
		System.out.println("Enter total number of names you want to store");
		int len=scr.nextInt();
		for(int i=0;i<len;i++)
			names.add(scr.nextLine());
	}
	public void display()
	{
		Iterator<String> it=names.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		// descending order iterator example
		Iterator<String> iterate=names.descendingIterator();
		while(iterate.hasNext())
			System.out.println(iterate.next());
			
	}
	public void operations()
	{
		names.remove(2);
		// to sort the linkedlist
		Collections.sort(names);
		// to reverse the linkedlist
		Collections.reverse(names);
		// method to remove the first element 
		names.removeFirst();
		//method to remove the last elemenbt 
		names.removeLast();
		//method to add elememnt at the specified index
		names.add("SinghSolu");
		//method to set a specific value in the list
		names.set(4,"NewlyAdded");
		//check if it contains the value or not
		if(names.contains("Prince"))
				System.out.println("It's there");
		else
			System.out.println("There's no such value left");
		// convert the list to array
		String[] name=names.toArray(new String[names.size()]);
		for(String nameString: name)
			System.out.println(nameString);
		
		//Sorting by overriding the comparator method
		Collections.sort(names,new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				return arg0.length() - arg1.length();
			}
	});
		
		
		
		// main method to call the functions.......
		
	}
	public static void main(String args[])
	{
		LinkList ls=new LinkList();
		ls.read();
        ls.display();
        ls.operations();
	}
}
