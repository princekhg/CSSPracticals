package CodeSetBeginners;

import java.util.*;
public class HashTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Hashtable <String,String>hs=new Hashtable<>();
       hs.put("Item1","Oranges");
       hs.put("Item2","Apple" );
       hs.put("Item3","Kiwi" );
       hs.put("Item4","Chestnut" );
       hs.put("Item5","Pines" );
       
       Enumeration<String> e=hs.keys();
       while(e.hasMoreElements())
       {
    	   String str=(String) e.nextElement();
    	   System.out.println(hs.get(str));
	}
	}

}
