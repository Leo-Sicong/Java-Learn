package com.seeion1;

public class SelfAddMinus {
	//static int a =1;
    public static void main(String[] args){
       // int a = 5;//����һ��������
    		
    	for(int a=0;a<5;a++) {
        int b = 1;
        int x = 2*++a;
        int y = 2*b++;
        System.out.println("���������ǰ׺�����a="+a+",x="+x);
        System.out.println("�����������׺�����b="+b+",y="+y);
    	}
    }
}