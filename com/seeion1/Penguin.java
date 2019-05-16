package com.seeion1;

public class Penguin {
	  static int name; 
	  static int id; 
	    
	    public static  int Penguin(int myName,int  myid) { 
	    	name = myName; 
	    	 id = myid; 
	        return name;
	    } 
	    public void eat(){ 
	        System.out.println(name+"正在吃"); 
	    }
	    public void sleep(){
	        System.out.println(name+"正在睡");
	    }
	    public void introduction() { 
	        System.out.println("大家好！我是"         + id + "号" + name + "."); 
	    } 
	    public static void main(String[] args) {
	    	int i = 5;
	        int j = 2;
	   int pen = Penguin(i,j);
	    	 System.out.println("结构" +pen);
	    		
	}
	   int dog = new eat();