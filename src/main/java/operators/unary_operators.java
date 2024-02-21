package operators;

import java.util.*;

public class unary_operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Digit :");
		int a1 = sc.nextInt();
		System.out.println("Pre-Increment : " + ++a1);
		System.out.println("Post-Increment : " + a1++);
		System.out.println(a1);

		System.out.println("Pre-Decrement : " + --a1);
		System.out.println("Post-Decrement : " + a1--);
		System.out.println(a1);
	}

}
