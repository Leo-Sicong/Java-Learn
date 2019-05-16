package com.seeion1;

public class TestPassByValue{
	int num1 = 0;
    int num2 = 0;

	 public static void main(String[] args) {
		    int num1 = 0;
		    int num2 = 0;
		    System.out.println("交换前 num1 的值为：" +
		                        num1 + " ，num2 的值为：" + num2);
		 
		    // 调用swap方法
		    swap(num1, num2);
		    //System.out.println("之积：" + num3);
		  }
		  /** 交换两个变量的方法 */
		  public static void swap(int n1, int n2){
		    System.out.println("\t进入 swap 方法");
		    System.out.println("\t\t交换前 n1 的值为：" + n1
		                         + "，n2 的值：" + n2);
		    // 交换 n1 与 n2的值
		    double[] myList = new double[5];
			double total = 0;
		    for(int i=0;i<5;i++) {
		    	n1+=1;
		    	n2+=1;
		    
		    	 myList[i] = n1*n2;
		    	 total =  total+ myList[i];
		   
		    System.out.println("数组" +i+"：" + myList[i] );
		    
		    
		    }
		    System.out.println("之积："  + total );
		    System.out.println(myList[0] + myList[1] + myList[2]+ myList[3]+ myList[4]);
		  }
		  }