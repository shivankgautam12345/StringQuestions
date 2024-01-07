package com.stringlearn.splitstring;
import java.util.Scanner;
public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc  = new Scanner(System.in);
          System.out.println("Enter the string:");
          String s1 = sc.nextLine();
          String[] arr = s1.split(" ");
          for(String s:arr) {
        	  System.out.println(s+" ");
          }
          
	}

}
