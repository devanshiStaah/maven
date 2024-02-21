package operators;

import java.util.*;

public class logical_operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age :");
		int age = sc.nextInt();
		if (age == 18 || age > 18) {
			System.out.println("You are eligible");
		} else if (age >= 18 && age <= 35) {
			System.out.println("You are betweem 18 to 35");
		}
	}

}
