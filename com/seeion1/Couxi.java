package com.seeion1;

public class Couxi {
	public static void main(String args[]) { 
		System.out.println("Today, what kind of ball do we play? :");
		leo Lsc = new leo();
		Lsc.play();
		Lsc.show();
	}
}

abstract class student {
	abstract void play(); 
	void show(){
		System.out.println("Play Basketball");
	}
}

class leo extends student{
	public  void play() {
		System.out.println("play football");
	}

	 
}