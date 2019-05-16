
package com.seeion1;

public class Test1 {
	 public static void main(String[] args) {
	char ch = 'a';
	 
	// Unicode 字符表示形式
	char uniChar = '\u039A'; 
	
	// 字符数组
	System.out.println(Character.isLetter('a'));
	char[] a ={ 'a', 'b', 'c', 'd', 'e' };
	System.out.print("整数数据：" + uniChar);
	System.out.println("分数数据：" + ch); 
	for(char x : a) {
		 if( x == 'c' ) {
			 continue;
	         }
	System.out.println("数组\n数据：" + x+"字符");
	}
}
}
