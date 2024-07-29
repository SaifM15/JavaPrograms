package com.product.fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteReadData {

	public static void main(String[] args) throws IOException {

		FileWriter f = new FileWriter("F2.txt");
		f.write("In the KiranAcademy Learned Java");
//		Writing the contents in the file 
		f.close();
		System.out.println("File created");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Name");
		String nm = sc.next();

		File obj = new File(nm);
		if (obj.exists()) {
			FileReader fr = new FileReader(obj);
			int i;
//			Reading the contents in the file
			while ((i = fr.read()) != -1)
				System.out.print((char) i);
			fr.close();

		}
		else
			System.out.println("File Does not Exists");
	}

}
