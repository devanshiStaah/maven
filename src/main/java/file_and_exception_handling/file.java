package file_and_exception_handling;

import java.io.*;
import java.util.*;

public class file {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Writing in file");
		System.out.println("2.Reading from file");
		System.out.println("Enter your Choice :");
		int i = sc.nextInt();
		switch (i) {
		case 1:
			try {
				FileWriter fw = new FileWriter("test.txt");
				fw.write("Hello");
				fw.close();

			} catch (Exception e) {
				System.out.println("Error :" + e);
			}
			System.out.println("Write Succeessfully..");
			break;
		case 2:
			try {
				FileReader fr = new FileReader("test.txt");
				int y;
				while ((y = fr.read()) != -1) {
					System.out.println((char) y);
				}
				fr.close();
			} catch (Exception e) {
				System.out.println("Error :" + e);
			}
			break;
		default:
			System.out.println("You entered wrong choice.");
			break;

		}

	}

}
