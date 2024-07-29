package com.product.basic;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterOperation {

	static char arr[] = new char[5];
	static Scanner sc = new Scanner(System.in);

	public static void setData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Array Element");
			arr[i]=sc.next().charAt(0);
		}
	}

	public static void sortData() {
		Arrays.sort(arr);
		System.out.println("Sorted Array " + Arrays.toString(arr));
	}

	public static void searchData(char ch) {
		int f = Arrays.binarySearch(arr, ch);
		if (f < 0)
			System.out.println("Character not found");

		else
			System.out.println("Character Found at the position :- "+ f);

	}
	
	public static void replaceData(char oldChar, char newChar) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == oldChar) {
	            arr[i] = newChar;
	        }
	    }
	    System.out.println("Array after replacement: " + Arrays.toString(arr));
	}

	public static void main(String[] args) {

	}

}
