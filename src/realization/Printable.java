package realization;

public interface Printable {
	void print();
	
//인터페이스에 명령을 작성할 수 있는 기본메소드 선언 - jdk 1.8 이상에서만 가능	
// => 인터페이스 상속받은 자식클래스에서 오버라이드 선언하지 않아도 가능
	default void scan() {
		System.out.println("[에러] 스캔 기능을 제공하지 않습니다.");
	}

}
