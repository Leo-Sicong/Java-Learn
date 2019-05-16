package com.seeion1;

import animals.Animal;

final class Animal {
	  void eat() {
	    System.out.println("animal : eat dog,cat");
	  }
	}
	 
	class Dog extends Animal {
	  void eat() {
	    System.out.println("dog : eat shit");
	  } 
	  void eatTest() {
	    this.eat();   // this 调用自己的方法
	    super.eat();  // super 调用父类方法
	  }
	}
	
	class Cat extends Animal {
		  void eat() {
		    System.out.println("cat : eat fish");
		  } 
		  void eatTest() {
		    this.eat();   // this 调用自己的方法
		    super.eat();  // super 调用父类方法
		  }
		}
	 
	public class Test3 {
	  public static void main(String[] args) {
	    Animal a = new Animal();
	    a.eat();
	    Dog d = new Dog();
	    d.eatTest();
	    Cat c = new Cat();
	    c.eatTest();
	  }
	}
