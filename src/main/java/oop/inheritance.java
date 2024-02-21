package oop;

class square {
	int length;

	square(int length) {
		this.length = length;
	}

	void sarea() {
		System.out.println("The Area of Square is : " + length * length);
	}
}

class rectangle extends square {
	int length, width;

	rectangle(int length, int width) {
		super(length);
		this.length = length;
		this.width = width;
	}

	void area() {
		System.out.println("The Area of Rectangle is : " + length * width);
	}
}

public class inheritance {

	public static void main(String[] args) {
		rectangle r = new rectangle(10, 20);
		r.area();
		r.sarea();
	}

}
