package com.seeion1;
import java.lang.Math;
public class Qushu {
	//static int max =0;
	//static int min =0;
	public static void main(String args[]) {
		int max =0;
		 int min =100;
		int count = 1;
	for(int i=0;i<100;i++) {
		int a=(int)(Math.random()*100);
		if(a>max) {
			max=a;
		}
		if(a<min) {
			min=a;
		}
		if(a>50) {
			System.out.println("����50���� "+a);
			count++;
		}
	}
	System.out.println("����� "+max);
	System.out.println("��С�� "+min);
	System.out.println("����Ϊ "+count);
	}
}
