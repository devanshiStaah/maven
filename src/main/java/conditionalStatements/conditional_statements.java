package conditionalStatements;

import java.util.*;

public class conditional_statements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one character from 1,2 and 3 :");
		int alpha;
		alpha = sc.nextInt();
		if (alpha == 1) {
			System.out.println("You entered 1");
		} else if (alpha == 2) {
			System.out.println("You entered 2");
		} else if (alpha == 3) {
			System.out.println("You entered 3");
		} else {
			System.out.println("You entered Wrong Digit");
		}

	}

}
