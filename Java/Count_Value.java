package com.Java;

import java.util.Scanner;

public class Count_Value {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name =k.nextLine();
		char [] a=name.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
				
				if(a[i]==a[j])
				{
					count++;
					
				}
				System.out.println(" The Count Value Of " + a[i] + "is=" +count);
			}
		}
		

	}


