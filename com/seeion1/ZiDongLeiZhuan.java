package com.seeion1;
public class ZiDongLeiZhuan {
		static int a;
	  public static void main(String[] args){
			       // 声明三个int型整数：a、 b、c
		  int y;
			int d = 3, e = 4, f = 5; // 声明三个整数并赋予初值
			byte z = 22;         // 声明并初始化 z
			String s = "runoob";  // 声明并初始化字符串 s
			double pi = 3.14159; // 声明了双精度浮点型变量 pi
			char x = 'x';        // 声明变量 x 的值是字符 'x'。
		  
          char c1='\n';//定义一个char类型
          int i1 = c1;//char自动类型转换为int
          System.out.println("char自动类型转换为int后的值等于"+i1+'\n'+'\r');
          char c2 = 'z';//定义一个char类型
          int i2 = c2+1;//char 类型和 int 类型计算
          System.out.println("char类型和int计算后的值等于"+i2);
          a=e;
          System.out.println(a);
          System.out.println(e);
          System.out.println(f);
          System.out.println(s);
          System.out.println(pi);
          System.out.println(x);
          System.out.println(d);
          System.out.println(z);
      }
}
