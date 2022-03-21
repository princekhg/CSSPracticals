package com.css.practical;

import java.io.*;
import java.util.*;

public class EmployeeSerial {
    List<Employee> employees=new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
      // password rotate
    public String passwordRotate(String pass,int n){
        char ch[]=new char[pass.length()];
        int index=pass.indexOf(Character.toString(n));
        for(int i=index+1,k=0;i<pass.length();i++,k++)
            ch[k]=pass.charAt(i);
        for(int i=0;i<=index;i++)
            ch[i]=pass.charAt(i);
        String str=new String(ch);
        return str;
    }
    //Password De-rotate
    public String passwordDeRotate(String pass,int n){
        char ch[]=new char[pass.length()];
        int index=pass.indexOf(Character.toString(n));
        int in=pass.length()-(index+1);
        for(int i=in,k=0;i<pass.length();i++,k++)
            ch[k]=pass.charAt(i);
        for(int i=0;i<index;i++)
            ch[i]=pass.charAt(i);
        String str=new String(ch);
        return str;
    }
    public static void main(String[] args) {
       EmployeeSerial ob=new EmployeeSerial();
        List<Employee> emp=new ArrayList<>();
       emp.add(new Employee("101","Subhankar","1234567",2994723.00,"101D"));
        emp.add(new Employee("102","Joginder","364892",298327.00,"101E"));
        emp.add(new Employee("103","Julia","97462834",295432.00,"101F"));
        emp.add(new Employee("104","Lincoln","9383642",293432.00,"101D"));
        emp.add(new Employee("105","Prince","93447382",293434.00,"101E"));
        emp.add(new Employee("107","Shubham","62947252",293343.00,"101F"));
        emp.add(new Employee("106","Ujjwal","62947583",285343.00,"101D"));
        emp.add(new Employee("108","Boron","62924352",299843.00,"101E"));
        emp.add(new Employee("109","Parvindar","62982392",256343.00,"101E"));
        int[] count =new int[emp.size()];
        Set<Employee> counter=new HashSet<>(emp);
        for (Employee e:counter)
            System.out.println(Collections.frequency(emp,e.getDeptNo()));
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream("file.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            // Method for serialization of object
            out.writeObject(emp);
            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        Employee object1 = null;
        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream("file.ser");
            ObjectInputStream in = new ObjectInputStream(file);
            // Method for deserialization of object
            object1 = (Employee)in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.getEmployeeiD());
            System.out.println("b = " + object1.getGetEmployeeName());
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}
