package com.seeion1;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ArithInt {
public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	System.out.println("����");
	while(true) {
		try {
			System.out.println("x��ֵ"); int x= stdIn.nextInt();
			System.out.println("y��ֵ"); int y= stdIn.nextInt();
			
			
			System.out.println(x+y);
			System.out.println(x%y);
			System.out.println("x / y="+(x/y));
		} catch (InputMismatchException | ArithmeticException e) {
			System.out.println("��������"+e);
			String s = stdIn.next();
			System.out.println("������"+s);
		}
		//catch (ArithmeticException e) {
		//	System.out.println("��������"+e);
		//	System.out.println("�����벻������ֵ");
		//}
	finally {
			System.out.println("---------");
			System.out.println("����һ��? 1 Y or 0 N");
			int retn = stdIn.nextInt();
			if (retn == 0)   break;
			System.out.println("---------");
		}
	}
			
} 
}
