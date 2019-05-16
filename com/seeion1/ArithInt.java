package com.seeion1;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ArithInt {
public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	System.out.println("运算");
	while(true) {
		try {
			System.out.println("x的值"); int x= stdIn.nextInt();
			System.out.println("y的值"); int y= stdIn.nextInt();
			
			
			System.out.println(x+y);
			System.out.println(x%y);
			System.out.println("x / y="+(x/y));
		} catch (InputMismatchException | ArithmeticException e) {
			System.out.println("发生错误"+e);
			String s = stdIn.next();
			System.out.println("忽略了"+s);
		}
		//catch (ArithmeticException e) {
		//	System.out.println("发生错误"+e);
		//	System.out.println("请输入不会错误的值");
		//}
	finally {
			System.out.println("---------");
			System.out.println("再来一次? 1 Y or 0 N");
			int retn = stdIn.nextInt();
			if (retn == 0)   break;
			System.out.println("---------");
		}
	}
			
} 
}
