/* this program has implemented the default methods
* these have been used to give a logical approach to use
*each and every method available in collection framework
*  */

package com.css.practical;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
private LinkedList <String> names=new LinkedList<>();
private void read()
{
    names.add("Sinner");
    names.add("hsife");
    names.add("liol");
}
// method to display the linkedlIst
private void display()
{
    for(String name: names)
        System.out.println(name);
}
//method to change specific value
private void change()
{
    names.set(2,"tina");
}
// method to sort the whole list
private void sortList()
{
    Collections.sort(names);
}
// method to reverse the linkedlist
private void reverseSort()
{
    //first you need to sort and then only you can reverse to check the reverse sorted form
    Collections.reverse(names);
}
//method to SearchTheList
private boolean searchElement(String data)
{
    return names.contains(data);
}
//method to check the size
public int checkSize()
{
    return names.size();
}
//iterator method to iterate through each elements in the arraylist
 private void iterateEle()
 {
     Iterator iterate= names.iterator();
     while(iterate.hasNext())
         System.out.print(iterate.next());
 }


public static void main(String args[])
{
    LinkedListClass lc=new LinkedListClass();
    lc.read();
    lc.display();
    lc.change();
    lc.display();
}





}
// contains("search")
//indexOf("")
//clear(); // clear all element stored in the linked list
//iterator() // loop it works with object // iterable
//sort() -- arrange elemnts in ascending  // which merge sort O(n log n)
//reverse()//descending order reverse
//size()  --