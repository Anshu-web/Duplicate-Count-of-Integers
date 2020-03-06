package com.test;

import java.io.IOException;

public class Notepad {
	
	
	 
		  public static void main(String[] args) {
		    Runtime rs = Runtime.getRuntime();

		    try {
		      rs.exec("notepad test.txt");
		     System.out.println(rs.availableProcessors()); 
		     
		    }
		    catch (IOException e) {
		      System.out.println(e);
		    }
		  }
		}


