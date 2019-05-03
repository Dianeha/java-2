package realization;

public class BoatCarRealApp {
public static void main(String[] args) {
	//BoatCarReal boatCar=new BoatCarReal();
	BoatCar boatCar=new BoatCarReal(); // 클래스의 부모로 참조변수 만드는 것을 권장
	
	
	//묵시적 객체 형변환
	boatCar.run();
	boatCar.floating();
	boatCar.navigate();
}
}
