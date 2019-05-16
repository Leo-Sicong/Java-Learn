package com.seeion1;

public class For_Test {
	 public static void main(String args[]){
	      int [] numbers = {10, 20, 30, 40, 50};
	 
	      for(int a : numbers ){
	    	 
	         System.out.print( a );
	         System.out.print(",");
	         if( a == 30 ) {
	              break;
	    	  }
	      }
	      System.out.print("\n");
	      String [] names ={"James", "Larry", "Tom", "Lacy"};
	      for( String name : names ) {
	         System.out.print( name );
	         System.out.print(",");
	      }
	   }
	}