package com.seeion1;

public class TestPassByValue{
	int num1 = 0;
    int num2 = 0;

	 public static void main(String[] args) {
		    int num1 = 0;
		    int num2 = 0;
		    System.out.println("����ǰ num1 ��ֵΪ��" +
		                        num1 + " ��num2 ��ֵΪ��" + num2);
		 
		    // ����swap����
		    swap(num1, num2);
		    //System.out.println("֮����" + num3);
		  }
		  /** �������������ķ��� */
		  public static void swap(int n1, int n2){
		    System.out.println("\t���� swap ����");
		    System.out.println("\t\t����ǰ n1 ��ֵΪ��" + n1
		                         + "��n2 ��ֵ��" + n2);
		    // ���� n1 �� n2��ֵ
		    double[] myList = new double[5];
			double total = 0;
		    for(int i=0;i<5;i++) {
		    	n1+=1;
		    	n2+=1;
		    
		    	 myList[i] = n1*n2;
		    	 total =  total+ myList[i];
		   
		    System.out.println("����" +i+"��" + myList[i] );
		    
		    
		    }
		    System.out.println("֮����"  + total );
		    System.out.println(myList[0] + myList[1] + myList[2]+ myList[3]+ myList[4]);
		  }
		  }