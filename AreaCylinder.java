package CodeSetBeginners;

import java.util.Scanner;

public class AreaCylinder {
private static final double PI=3.14159;
private Scanner scr=new Scanner(System.in);
double rad,height;
private void read() {
	// TODO Auto-generated method stub
	System.out.println("Enter the radius of cone");
	rad=scr.nextDouble();
	System.out.println("Enter the height of cone");
	height=scr.nextDouble();
}

private double calculate() {
	// TODO Auto-generated method stub
	double area=(2*PI*rad*height)+(2*PI*Math.pow(rad, 2));
	area=area*100;
	int a=(int)area;
	return ((double)a/100);
}
private void display() {
	// TODO Auto-generated method stub
	System.out.println("The area of Cylinder is -- "+calculate());
}


public static void main(String args[])
{
	AreaCylinder ac=new AreaCylinder();
	ac.read();
	ac.calculate();
	ac.display();
}















}
