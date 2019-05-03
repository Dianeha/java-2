package freeexample;

public class Bicycle {

	public String color;
	public int price;

	public Bicycle() {
		System.out.println(" Bycycle constuctor - 1");
	}

	public Bicycle(String c, int p) {
		System.out.println(" Bycycle constuctor - 2");
		color = c;
		price = p;
	}

	public void info() {
		System.out.println(" ---- info ---- ");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
}