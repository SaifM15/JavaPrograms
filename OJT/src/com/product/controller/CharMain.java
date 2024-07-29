package com.product.controller;

import java.util.Scanner;

import com.product.basic.CharacterOperation;

public class CharMain {

	public static void main(String[] args) {

		int ch, choice = 1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Accept character Array");
			System.out.println("2. Sort ");
			System.out.println("3. Search");
			System.out.println("4. Replace");
			System.out.println("5. Exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1: {
				CharacterOperation.setData();
				break;
			}
			case 2: {
				CharacterOperation.sortData();
				break;

			}
			case 3: {
				System.out.println("Enter character to serch");
				CharacterOperation.searchData(sc.next().charAt(0));
				break;
			}
			case 4:
			{
				 System.out.println("Enter the character to replace: ");
                 char oldChar = sc.next().charAt(0);
                 System.out.println("Enter the replacement character: ");
                 char newChar = sc.next().charAt(0);
                 CharacterOperation.replaceData(oldChar, newChar);
                 break;
			}
			case 5: 
				System.exit(0);
			}

			System.out.println("Enter 1 to continue or 0 to exit");
			choice=sc.nextInt();
		} while (choice == 1);

	}

}
