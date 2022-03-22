package CodeSetBeginners;
import java.util.*;
public class SortLinkedList {

private LinkedList<String> ls=new LinkedList<>();
public void add()
{
	ls.add("java");
	ls.add("is");
	ls.add("a");
	ls.add("programming");
	ls.add("language");
	ls.add("platform");
	ls.add("independent");
	Comparator<String> r= Collections.reverseOrder();
	Collections.sort(ls,r);
	Iterator<String> itr=ls.iterator();
	while(itr.hasNext())
		System.out.println(itr.next()+" ");
	Collections.shuffle(ls);
	 Iterator iter=ls.iterator();
	System.out.println("The list has been shuffled ");
	while(iter.hasNext())
	{
	 	System.out.println(iter.next()+ " ");
	     System.out.println();
	     System.out.println("Minimum : - " + Collections.min(ls));
	     System.out.println("Maximum :- "+Collections.max(ls));
	     
	}
}
public static void main(String args[])
{
	SortLinkedList sl=new SortLinkedList();
	sl.add();
}
}
