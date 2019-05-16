package com.seeion1;

import java.util.ArrayList;

 public class Classculator {
	 /*	public static double calZu(int[] numbers) {
	int sum = 0;
	for(int i=0;i<numbers.length;i++)
	{
		sum += numbers[i];
	}
	return sum;
} */
	static double  max =0;		//成员变量
	static double b=0;
public static double findFn(ArrayList<Double> numbers) {
	 
	for(int j=0;j<numbers.size();j++) {
	b= numbers.get(j);

	System.out.println("b的值"+b);
	for(int i=0;i<4;i++)
	{
		b=5*(b+1)/4;	
		max=b;
	}	
	System.out.println("max  = "  +  max);
	if(10.0*max%10==0) {
		
		return  max;
	}
	}

	return max;
}


public static void main(String args[]) { 
	ArrayList<Double>  numbers  =new  ArrayList<Double>();
	for (int i = 0; i < 10000; i++) {
		double a = 5*i;
		numbers.add((double)a);
	} 
	System.out.println("整型"+findFn(numbers)); }
}
