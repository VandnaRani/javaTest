package corejava_programs;

import java.util.Scanner;

public class NewClass {

	public static void main(String[] args) {
		
       int l,i;
		String abc = "selenium";
		String b2 ="";
		l=abc.length();
		for( i = l-1;i>=0;i--)
		{
			b2= b2+abc.charAt(i);
		}
		
		System.out.println(b2);
			
		}
	}


