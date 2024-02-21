package oop;

abstract class animal {
	String name;

	abstract void setname(String name);

	abstract String getname();

	void animal() {
		System.out.println("Animal Class Called.");
	}
}

class child extends animal {
	String name;

	@Override
	void setname(String name) {
		this.name = name;

	}

	@Override
	String getname() {
		return name;

	}
}

public class abstraction {
	public static void main(String[] args) {
		child c = new child();
		c.setname("Pig");
		System.out.println("Animal is " + c.getname());
		c.animal();
	}

}
