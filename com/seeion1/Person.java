package com.seeion1;
import java.util.Scanner; 

public class Person {
	// private String Pname;
	public  int age;
	public   String sex;
	public   String name,phonename;
	
	public   String getName() {
	return name;

	}
	
	public int getAge() {
		return 0;
		
	}
	
	public static void main(String args[]) { 
		 Person leo = new Person();
	System.out.println(leo.getName());
	}
}
	