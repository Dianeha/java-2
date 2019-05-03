package generalization;

public class MemberApp {
	public static void main(String[] args) {

		Member member1 = new Member();

		member1.setEmail("lilycat92@naver.com");
		member1.setName("하다연");
		member1.display();
		System.out.println("======================================");
		
		Member member2 = new Member("lillyqueen@naver.com", "권연주");
		member2.display();
		System.out.println("======================================");

		
	}
}
