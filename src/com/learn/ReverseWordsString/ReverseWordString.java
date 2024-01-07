package com.learn.ReverseWordsString;
import java.util.Scanner;
public class ReverseWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.nextLine();
        String[] arr = s1.split(" "); 
        for(String x:arr) {
        	String s2 = "";
        	for(int j  = x.length()-1;j>=0;j--) {
        		s2 = s2+x.charAt(j);
        	}System.out.print(s2+" ");
        }
        
	}

}
