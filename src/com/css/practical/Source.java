package com.css.practical;

import java.util.ArrayList;
import java.util.Iterator;


public class Source {

    void addItem(ArrayList<String> groceryList, String item)
    {
        groceryList.add(item);
    }
    String modifyItem(ArrayList<String> groceryList,int index,String newItem)
    {
       groceryList.add(index,newItem);
       return ("Item of Index "+index+" has been modified");
    }
    String removeItem(ArrayList<String> groceryList,int index)
    {
        groceryList.remove(index);
        return ("Item of Index " + index +" has been remove");
    }

    String searchItem(ArrayList<String> groceryList,String searchItem)
    {
        if(groceryList.indexOf(searchItem)>-1)
            return groceryList.get(groceryList.indexOf(searchItem));
        return "No Such Item";
    }
     int getSize(ArrayList<String> groceryList)
     {
         return groceryList.size();
     }


    public static void main(String[] args) {
        Source source=new Source();
        ArrayList<String> groceryList=new ArrayList<>();
       source.addItem(groceryList,"coffee");
      System.out.println(source.modifyItem(groceryList,0,"beans"));
    }


}
