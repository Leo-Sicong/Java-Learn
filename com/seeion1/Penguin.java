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
	        System.out.println(name+"���ڳ�"); 
	    }
	    public void sleep(){
	        System.out.println(name+"����˯");
	    }
	    public void introduction() { 
	        System.out.println("��Һã�����"         + id + "��" + name + "."); 
	    } 
	    public static void main(String[] args) {
	    	int i = 5;
	        int j = 2;
	   int pen = Penguin(i,j);
	    	 System.out.println("�ṹ" +pen);
	    		
	}
	   int dog = new eat();