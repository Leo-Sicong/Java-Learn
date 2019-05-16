package com.seeion1;

public class Zzai {
	String name;
	public   Zzai (String s) { //构造方法
	name = s;
}

}
class Sons extends Zzai{
	String Dment;
	public Sons(String s,String b) {
		super(s);
		Dment = b;
	}
	public static void main(String args[]) { 
		Sons leo= new Sons('bang','ao');
	}
	
	System.out.println(leo.);
}

