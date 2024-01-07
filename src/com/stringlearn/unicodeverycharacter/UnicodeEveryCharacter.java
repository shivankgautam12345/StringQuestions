package com.stringlearn.unicodeverycharacter;
import java.util.Scanner;

public class UnicodeEveryCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1 = sc.next();
        int unicode = 0;
        for(int i = 0;i<=s1.length()-1;i++) {
        	unicode = s1.charAt(i);
        	System.out.println("The Unicode Value of Every character"+i+"is"+unicode);
        }
        
        
	}

}
