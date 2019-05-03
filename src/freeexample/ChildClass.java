package freeexample;

public class ChildClass {

	public String name;
	public String gender;
	public int age;

	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("--- ChildClass constuctor ---");
	}

	public void setInfo(String n, String g, int a) {
		System.out.println("--- setInfo() START ---");

		name = n;
		gender = g;
		age = a;
	}

	public void getInfo() {
		System.out.println("--- getInfo() START ---");

		System.out.println(" name : " + name);
		System.out.println(" gender : " + gender);
		System.out.println(" age : " + age);

				
	}
}
