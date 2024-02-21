package loop;

import java.util.*;

public class loop_statement {

	public static void main(String[] args) {

		System.out.println("Loops :");
		System.out.println("1.For Loop :");
		System.out.println("2.While Loop :");
		System.out.println("3.Do..While Loop  :");
		System.out.println("4.Nested Loop :");
		System.out.println("Enter Your Choice: ");
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();

		switch (s1) {
		case 1:
			System.out.println("Using for Loop :");
			for (int i = 0; i <= 5; i++) {
				System.out.println(i);
			}
			break;
		case 2:
			System.out.println("Using while Loop :");
			int x = 0;
			while (x <= 5) {
				System.out.println(x);
				x++;
			}
			break;
		case 3:
			int y = 1;
			do {
				System.out.println("Hello From Devanshi.");
				y++;
			} while (y <= 5);
			break;
		case 4:
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		default:
			System.out.println("You entered a wrong choice.");
			break;
		}

	}

}
