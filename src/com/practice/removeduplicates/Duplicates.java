package com.practice.removeduplicates;
import java.util.*;
public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc  = new Scanner(System.in);
          String s1 = "AABBBBSSSSCCCCGHHHH";
          String s2 = "";
          for(int i = 0;i<=s1.length()-1;i++) {
        	  if(!s2.contains(s1.charAt(i)+"")) {
        	  s2 = s2+s1.charAt(i);
          }}System.out.println(s2);
          
	}

}
