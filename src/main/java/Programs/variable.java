package Programs;

public class variable {

	public static void main(String[] args) {
		int a = 10;
		String s = "Devanshi";
		float f = 20;
		double d = 25.00;
		boolean b = true;

		System.out.println(a + " is " + ((Object) a).getClass().getSimpleName());
		System.out.println(s + " is " + ((Object) s).getClass().getSimpleName());
		System.out.println(f + " is " + ((Object) f).getClass().getSimpleName());
		System.out.println(d + " is " + ((Object) d).getClass().getSimpleName());
		System.out.println(b + " is " + ((Object) b).getClass().getSimpleName());

	}

}
