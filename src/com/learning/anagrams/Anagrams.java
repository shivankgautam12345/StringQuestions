package com.learning.anagrams;
import java.util.Scanner;
import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1 = "silent";
         String s2 = "listen";
         char[]arr1 = s1.toCharArray();
         char[] arr2  = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String s3 = new String(arr1);
        String s4 = new String(arr2);
        if(s3.equalsIgnoreCase(s4)) {
        	System.out.println("Strings are Anagrams");
        }else {
        	System.out.println("Not Anagrams");
        }
	}

}
