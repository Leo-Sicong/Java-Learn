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
	    this.eat();   // this �����Լ��ķ���
	    super.eat();  // super ���ø��෽��
	  }
	}
	
	class Cat extends Animal {
		  void eat() {
		    System.out.println("cat : eat fish");
		  } 
		  void eatTest() {
		    this.eat();   // this �����Լ��ķ���
		    super.eat();  // super ���ø��෽��
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
