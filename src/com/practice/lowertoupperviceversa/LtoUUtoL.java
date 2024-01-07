package com.practice.lowertoupperviceversa;
import java.util.Scanner;
public class LtoUUtoL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc  = new Scanner(System.in);
       String s1 = "higuerUHYUG";
       int unicode;
       char ch[] = s1.toCharArray();
       for(int i = 0;i<=ch.length-1;i++) {
    	    unicode = (int)ch[i];
    	   if(unicode>=65 && unicode<=90) {
    		   unicode = unicode+32;
    	   }else if(unicode>=97) {
    		   unicode = unicode-32;
    	   }
    	   ch[i]= (char)unicode;
       }String str1 = new String(ch);
       System.out.println(str1);
	}

}
