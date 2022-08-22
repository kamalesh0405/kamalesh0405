package com.Java;

public class String_Length {

	public static void main(String[] args) {
		String name="I am Kamalesh I am From Kangayam";
		String[] split=name.split(" ");
		int count=0;
		for(int i=0;i<split.length;i++)
		{
			count ++;
			
		}
		System.out.println(count);

	}

}
