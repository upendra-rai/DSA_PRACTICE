package com.one.d.array.practice;

import java.util.Scanner;

public class array_creation {
	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("Please Enter no of elements in array");
		n=s.nextInt();
		int a[]= new int [n];
		
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			
			
			
		}
	}

}
