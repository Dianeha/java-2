package generalization;

public class EventMemberApp {
	public static void main(String[] args) {
		// 자식클래스의 생성자로 인스턴스를 생성할 경우
		// Member() 생성자(즉, 부모클래스 생성자) 우선 실행 후 EventMember() 생성자(자식클래스 생성자) 실행
		// => 부모 인스턴스 생성 후 자식 인스턴스 생성
		EventMember member1 = new EventMember();

		member1.setEmail("abc@daum.net");
		member1.setName("홍길동");
		member1.setAddress("서울시 강남구");
		//member1.displayEvent();
		member1.display();
		System.out.println("============================================");
		
		EventMember member2 = new EventMember("xyz@naver.com", "임꺽정", "수원시 팔달구");
		member2.displayEvent();
		System.out.println("============================================");
	}
}

