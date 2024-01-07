package com.practice.Countuplc;
import java.util.Scanner;
public class CountUpperAndLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc  = new Scanner(System.in);
           System.out.println("Enter the String:");
           String s1 = sc.nextLine();
           char[]ch = s1.toCharArray();
           int count = 0;
           int count2 = 0;
           for(int i = 0;i<=ch.length-1;i++) {
        	   if(ch[i]>'A' && ch[i]<'Z') {
        		   count++;
        	   }
           }System.out.println(count);
           
           for(int i = 0;i<=ch.length-1;i++) {
        	   if(ch[i]>'a' && ch[i]<'z') {
        		   count2++;
        	   }
           }
           System.out.println(count2);
           
           
           
	}

}
