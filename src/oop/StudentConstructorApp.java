package oop;

public class StudentConstructorApp {
	public static void main(String[] args) {
		// new 연산자로 기본 생성자를 이용하여 인스턴스 생성 >> 필드에 기본값 자동 저장
		StudentConstructor student1 = new StudentConstructor();

		/*
		 * System.out.println( "학번 = " + student1.getNumber() + ", 이름 = " +
		 * student1.getName() + ", 주소 = " + student1.getAddress());
		 */
		
		//Getter 메소드를 호출하여 인스턴스 필드값 사용
		student1.display();
		System.out.println("========================================================");
		
		//Setter 메소드를 호출하여 인스턴스 필드값 변경
		student1.setNumber("1234");
		student1.setName("홍길동");
		student1.setAddress("서울시 강남구");
		student1.display();
		System.out.println("========================================================");

		//생성자 파라메터에 값을 전달하여 인스턴스 생성시 필드에 초기값 저장
		StudentConstructor student2=new StudentConstructor("1234");
		student2.display();
		System.out.println("========================================================");
		StudentConstructor student3=new StudentConstructor("3456", "임꺽정");
		student3.display();
		System.out.println("========================================================");
		StudentConstructor student4=new StudentConstructor("1000", "전우치", "대구시 수성구");
		student4.display();
		System.out.println("========================================================");
	}

}
