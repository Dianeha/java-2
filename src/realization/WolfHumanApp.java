package realization;

public class WolfHumanApp {
	public static void main(String[] args) {
		WolfHuman wh = new WolfHuman();

		wh.speak();
		wh.walk();
		wh.change();
		wh.cryLoudly();
		wh.fastWalk();
		wh.change();
		System.out.println("=====================================");

		// 부모클래스로 참조변수를 생성하여 인스턴스를 저장한 경우 부모클래스의 메소드 참조
		Human human = new WolfHuman();

		human.speak();
		human.walk();

		// 명시적 객체 형변환을 이용해 자식 클래스의 메소드 호출 가능
		((WolfHuman) human).change();
		System.out.println("=====================================");

		// 자식클래스가 동일한 경우 부모클래스의 참조변수의 자료형을 부모인터페이스 자료형으로
		// 명시적 객체 형변환 가능
		Wolf wolf = (Wolf)human;
		
		wolf.cryLoudly();
		wolf.fastWalk();
		
		System.out.println("=====================================");
	}
}
