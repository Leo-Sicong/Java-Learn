
package com.seeion1;

public class Test1 {
	 public static void main(String[] args) {
	char ch = 'a';
	 
	// Unicode �ַ���ʾ��ʽ
	char uniChar = '\u039A'; 
	
	// �ַ�����
	System.out.println(Character.isLetter('a'));
	char[] a ={ 'a', 'b', 'c', 'd', 'e' };
	System.out.print("�������ݣ�" + uniChar);
	System.out.println("�������ݣ�" + ch); 
	for(char x : a) {
		 if( x == 'c' ) {
			 continue;
	         }
	System.out.println("����\n���ݣ�" + x+"�ַ�");
	}
}
}
