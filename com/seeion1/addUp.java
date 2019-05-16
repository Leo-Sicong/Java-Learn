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
	 System.out.println("整型"+a);
	 System.out.println("字符型"+b);
	 System.out.println("布尔型"+c);
	 System.out.println("双精度"+d);
	 System.out.println("双精度"+add1.a);
	 System.out.println("双精度"+add1.d);
	 System.out.println("双精度"+add1.c);
	 }
	 else
	 {
		 System.out.println("整型"+a);
		 System.out.println("字符型"+b);
		 System.out.println("布尔型"+c);
		 System.out.println("双精度"+d);
		 System.out.println("双精度"+add1.a);
		 System.out.println("双精度"+add1.d); 
	 }
 }
}
