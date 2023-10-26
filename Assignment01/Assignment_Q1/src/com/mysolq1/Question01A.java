package com.mysolq1;


/*1. Write a program to print no of comparisions done to search a key in
	i. linear search
*/

import java.util.*;

public class Question01A {
	
	public static int linearSearchComparisions(int arr[],int size,int key) {

		for(int i=0;i<size;i++) {
			if(arr[i] == key) {
				System.out.println("Element Found...");
				return i;
			}
			
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		
		
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		int size = arr.length;
		
		System.out.print("Enter the key that you want to search : ");
		Scanner sc = new Scanner(System.in);
		
		int key = sc.nextInt();
		
		
		int comparisions = linearSearchComparisions(arr,size,key);
		
		System.out.println("Comparisions are : " + comparisions);

	}

}
