package generalization;

public class MemberCastApp {
	public static void main(String[] args) {

		// 부모클래스 참조변수 = new 부모클래스();
		// => 가능 : 부모 인스턴스 생성하여 부모 참조변수에 저장
		Member member1 = new Member();
		// 부모참조변수에 저장된 인스턴스를 이용해 부모 클래스의 요소에 접근 가능
		member1.setEmail("lilycat92@naver.com");
		member1.setName("하다연");

		member1.display();
		System.out.println("==================================");

		// 자식클래스 참조변수 = new 자식클래스();
		// => 가능: 부모인스턴스와 자식인스턴스를 생성 => 자식인스턴스 정보를 자식참조변수에 저장
		EventMember member2 = new EventMember();

		// 자식참조변수에 저장된 인스턴스를 이용 > 자식클래스의 요소 & 부모클래스 요소(메소드 등) 모두 접근 가능
		member2.setEmail("lillyqueen@naver.com");
		member2.setName("권연주");
		member2.setAddress("대구광역시 수성구");

		member2.display();
		System.out.println("==================================");

		// 자식클래스 참조변수 = new 부모클래스(); (부모클래스의 인스턴스를 생성해 자식클래스 참조변수에 저장한다는 의미)
		// 불가능 => 자식인스턴스가 생성되지 않아 에러발생
		// EventMember member3 = new Member();
		System.out.println("==================================");

		// 부모클래스 참조변수 = new 자식클래스(); 가능
		// 자식 생성자를 통해 인스턴스를 만들면, 부모인스턴스가 먼저 생성되고 자식인스턴스 생성, 부모클래스 참조변수에 저장 가능
		// 기본적으로 부모클래스의 메소드에만 접근 가능
		Member member4 = new EventMember();
		member4.setEmail("lillycow@naver.com");
		member4.setName("하종배");
		// member4.setAddress("대구광역시 수성구"); //자식 클래스 요소에 접근 불가 => 에러

		// 객체 형변환을 이용해 자식클래스 요소에 접근 가능
		// 명시적 객체 형변환을 이용해 부모참조변수를 자식참조변수 형태로 변환
		// 자식인스턴스 정보로 =일=시=적=으=로= 변환하여 자식클래스 요소에 접근
		
		/*
		EventMember member = (EventMember) member4;
		member.setAddress("대구광역시 수성구");
		*/
		
		((EventMember) member4).setAddress("대구광역시 수성구");
	
		//묵시적 객체 형변환을 이용하여 참조변수에 저장된 부모인스턴스 정보를
		//JVM이 자동으로 자식인스턴스 정보로 일시적으로 변환하여 자식클래스 요소에 접근 
		// => +오+버+라+이+드+ 선언된 메소드인 경우 부모클래스의 메소드가 숨겨져 자식클래스의 메소드에 접근
		member4.display();
		System.out.println("==================================");
		
	}
}
