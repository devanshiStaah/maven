package oop;

class Fruits {

	String name;
	String color;

	void setname(String name) {
		this.name = name;
	}

	void setcolor(String color) {
		this.color = color;
	}

	String getname() {
		return name;
	}

	String getcolor() {
		return color;
	}
}

public class encpsulation {

	public static void main(String[] args) {
		Fruits f = new Fruits();
		f.setname("Apple");
		f.setcolor("Red");
		System.out.println("Fruit Name is " + f.getname() + " And Color is " + f.getcolor());
	}

}
