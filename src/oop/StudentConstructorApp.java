package oop;

public class StudentConstructorApp {
	public static void main(String[] args) {
		// new �����ڷ� �⺻ �����ڸ� �̿��Ͽ� �ν��Ͻ� ���� >> �ʵ忡 �⺻�� �ڵ� ����
		StudentConstructor student1 = new StudentConstructor();

		/*
		 * System.out.println( "�й� = " + student1.getNumber() + ", �̸� = " +
		 * student1.getName() + ", �ּ� = " + student1.getAddress());
		 */
		
		//Getter �޼ҵ带 ȣ���Ͽ� �ν��Ͻ� �ʵ尪 ���
		student1.display();
		System.out.println("========================================================");
		
		//Setter �޼ҵ带 ȣ���Ͽ� �ν��Ͻ� �ʵ尪 ����
		student1.setNumber("1234");
		student1.setName("ȫ�浿");
		student1.setAddress("����� ������");
		student1.display();
		System.out.println("========================================================");

		//������ �Ķ���Ϳ� ���� �����Ͽ� �ν��Ͻ� ������ �ʵ忡 �ʱⰪ ����
		StudentConstructor student2=new StudentConstructor("1234");
		student2.display();
		System.out.println("========================================================");
		StudentConstructor student3=new StudentConstructor("3456", "�Ӳ���");
		student3.display();
		System.out.println("========================================================");
		StudentConstructor student4=new StudentConstructor("1000", "����ġ", "�뱸�� ������");
		student4.display();
		System.out.println("========================================================");
	}

}
