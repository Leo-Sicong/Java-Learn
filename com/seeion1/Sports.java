package com.seeion1;

public interface Sports {
    void play(int c);
    char eat();
   	
}
 
class Hourse implements Sports {
	
	private int point ;
	public void play(int c) {
		point = c+2;
		  System.out.println(point);
	}
	public char eat() { 
		
		return 0;
	}	
	
	public static void main(String args[]){
		   Hourse m = new Hourse();
		      m.eat();
		      m.play(5);
		    }
}