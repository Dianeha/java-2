package oop;

public class MemberThisApp {
	public static void main(String[] args) {
		MemberThis member1 = new MemberThis();
		member1.display();
		System.out.println("============================================");
		member1.setId("abc");
		member1.setPassword("5678");
		member1.setName("�ϴٿ�");
		member1.display();
		System.out.println("============================================");
		MemberThis member2 = new MemberThis("xyz", "9101", "�ǿ���");
		member2.display();
		System.out.println("============================================");	
		}
}
