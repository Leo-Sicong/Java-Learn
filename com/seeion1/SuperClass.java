package com.seeion1;
import java.util.Scanner; 

public class SuperClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // �Ӽ��̽�������
 
        // next��ʽ�����ַ���
        System.out.println("next��ʽ���գ�");
        // �ж��Ƿ�������
        if (scan.hasNextLine()) {
            String str1 = scan.nextLine();
            System.out.println("���������Ϊ��" + str1);
        }
        scan.close();
    }
}