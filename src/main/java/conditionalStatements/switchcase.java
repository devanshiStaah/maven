package conditionalStatements;

import java.util.*;

public class switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character from A to D :");
		String s1 = sc.nextLine();
		switch (s1) {
		case "a":
			System.out.println("You Entered A.");
			break;
		case "b":
			System.out.println("You Entered B.");
			break;
		case "c":
			System.out.println("You Entered C.");
			break;
		case "d":
			System.out.println("You Entered D.");
			break;
		default:
			System.out.println("You Entered Wrong Character.");
			break;
		}

	}

}
