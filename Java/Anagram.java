package com.Java;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Enter The Name:");
		String name1=k.nextLine();
		String name2=k.nextLine();
		Arrays.sort(name1.toCharArray());
		Arrays.sort(name2.toCharArray());
		if (name1.length()==name2.length())
		{
			System.out.println("Anagram");
			
		}
		else
		{
			System.out.println("Not Anagram");
		}


	}

}
