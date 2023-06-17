package com.javaPrograms;

import java.util.Scanner;

public class EvenAndOddNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			if(num%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			
			num=num/10; 
		}
		
		System.out.println("Number of even numbers: "+even_count);
		System.out.println("Number of odd numbers: "+odd_count);
		
	}
}
