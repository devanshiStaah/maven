package operators;

import java.util.*;

public class assignemnt_operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Digit :");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Digit :");
		int num2 = sc.nextInt();

		num1 += 20;
		System.out.println("operators:");
		System.out.println(num1);
		num1 -= 50;
		System.out.println(num1);
		num1 *= 2;
		System.out.println(num1);
		num1 /= 2;
		System.out.println(num1);
		num1 %= 5;
		System.out.println(num1);

		int num3 = num2;
		System.out.println("Assigning valut to other varibale :" + num3);
	}
}
