package oop;

public class polymorphism {
	void fruit(String name) {
		System.out.println("Fruit Name is : " + name);
	}

	void fruit(String name, String color) {
		System.out.println("Fruit Name is : " + name + " and Color is :" + color);
	}

	public static void main(String[] args) {
		polymorphism poly = new polymorphism();
		poly.fruit("Apple");
		poly.fruit("Mango", "Yellow");

	}

}
