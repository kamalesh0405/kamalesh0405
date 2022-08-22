package com.Java;

import java.util.Scanner;

public class Malayalam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Original Name:");
		String name = scan.nextLine();
		System.out.print(name );
		
		System.out.println("After Reverce:"  );
		for(int i=name.length()-1;i>=0;i--)
			
		{
		
			
			
		
		System.out.print(name.charAt(i));
		
		}
		
		
		

	}

}
