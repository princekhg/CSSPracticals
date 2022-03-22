package CodeSetBeginners;
import java.util.*;
public class MyStackExample {
private LinkedList<Object> list=new LinkedList<>();

// method to perform push
private void push(Object o)
{
	list.add(o);
}
// perform next push
private void push2(Object obj)
{
	list.add(obj);
}
private Object bottom()
{
	return list.getLast();
}

public Object pop()
{
	return list.removeFirst();
}

public static void main(String args[])
{
	Car myCar;
	Bird myBird;
	MyStackExample stack=new MyStackExample();
	stack.push(new Car("Alto","Benz","Qualis"));
	stack.push2(new Bird("Parrot","Penguin","Kiwi"));
	myCar=(Car)stack.pop();
	System.out.println("The first element in the stack =" +myCar);
	myBird=(Bird)stack.bottom();
	System.out.println("The last element in the stack =" +myBird);
}
}
