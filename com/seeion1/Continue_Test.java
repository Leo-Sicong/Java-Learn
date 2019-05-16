package com.seeion1;

public class Continue_Test {
	public static void main(String args[]) {
	      int [] numbers = {10, 20, 30, 40, 50};
	 
	      for(int x : numbers ) {
	         if( x == 30 ) {
	        	 System.out.print( x+"\n");
	        continue;	        
	         }
	         x++;
	         System.out.print( x );
	         System.out.print("\n");
	      }
	   }
	}
