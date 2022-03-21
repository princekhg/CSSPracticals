package com.css.practical;

import java.io.*;
import java.util.Arrays;

public class PersonSerializable {
    public static void main(String[] args) {
        Person person=new Person(new Pet[]{new Pet("DODO", "Labrador", "Dog")});
        try(ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("text.txt"))){
            System.out.println("Serialzation of - "+ Arrays.toString(person.getPets()));
        }catch (IOException ioe){
            System.out.println("IOException thrown while writing the serilizable class object = "+ioe.getMessage());
        }
        try(ObjectInputStream objin=new ObjectInputStream(new FileInputStream("text.txt"))){
            Object ob=objin.readObject();
            if(ob instanceof Person){
                Person retrive=(Person) ob;
                System.out.println("Retrived Person has  - "+ Arrays.toString(retrive.getPets()));
            }
        }catch (Exception e){
            System.out.println("Exception thrown reading serialized object = "+e.getMessage());
        }
    }
}
