package com.seeion1;

public class addUp {
	static int a;
	static String b;
 static Boolean c;
 static double d;
 public  addUp() {
	 a=1;
	 d=2.11;
	 c=false;
 } 
 static addUp  add1 = new addUp();
 public static void main(String[] args) {
	 if (c) {
	 System.out.println("����"+a);
	 System.out.println("�ַ���"+b);
	 System.out.println("������"+c);
	 System.out.println("˫����"+d);
	 System.out.println("˫����"+add1.a);
	 System.out.println("˫����"+add1.d);
	 System.out.println("˫����"+add1.c);
	 }
	 else
	 {
		 System.out.println("����"+a);
		 System.out.println("�ַ���"+b);
		 System.out.println("������"+c);
		 System.out.println("˫����"+d);
		 System.out.println("˫����"+add1.a);
		 System.out.println("˫����"+add1.d); 
	 }
 }
}
