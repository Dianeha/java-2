package generalization;

public class MemberApp {
	public static void main(String[] args) {

		Member member1 = new Member();

		member1.setEmail("lilycat92@naver.com");
		member1.setName("�ϴٿ�");
		member1.display();
		System.out.println("======================================");
		
		Member member2 = new Member("lillyqueen@naver.com", "�ǿ���");
		member2.display();
		System.out.println("======================================");

		
	}
}
