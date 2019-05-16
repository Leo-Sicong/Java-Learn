package com.seeion1;
import java.util.Scanner; 
public class Xiti8 {
	
	 public static void main(String[] args) {
		 int n;
	 Scanner scan = new Scanner(System.in);
	 System.out.println("请输入数字 ");
	 n=scan.nextInt();
	 int num=1;
	 for(int i=2;i<n;i++) {
		 num*=n%i;
	
	 }
	 if(num == 0) {
		 System.out.println("不是一个质数"); 
	 }
	 else
	 {
		 System.out.println("这是一个质数  "); 
	 }
	 }
}
