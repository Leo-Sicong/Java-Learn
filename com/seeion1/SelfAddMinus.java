package com.seeion1;

public class SelfAddMinus {
	//static int a =1;
    public static void main(String[] args){
       // int a = 5;//定义一个变量；
    		
    	for(int a=0;a<5;a++) {
        int b = 1;
        int x = 2*++a;
        int y = 2*b++;
        System.out.println("自增运算符前缀运算后a="+a+",x="+x);
        System.out.println("自增运算符后缀运算后b="+b+",y="+y);
    	}
    }
}