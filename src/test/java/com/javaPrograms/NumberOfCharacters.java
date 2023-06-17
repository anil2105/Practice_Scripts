package com.javaPrograms;

import java.util.Scanner;

public class NumberOfCharacters 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String string = sc.nextLine();
		
		int count=0;
		
		for(int i=0;i<string.length(); i++)
			if(string.charAt(i)!=' ' )
			{
				count++;
			}
		
		System.out.println("Number of characters in a string: "+count);
	}
}
