package site.app;

import java.util.Date;
import java.util.Scanner;

//키보드로 이름과 태어난 연도를 입력받아 이름과 나이를 계산해 출력하는 프로그램
//ex) 이름 입력 >> 홍길동
//    태어난 연도 입력 >> 2000
//	  [결과]홍길동님의 나이는 20살입니다.
public class CalcAgeApp {
	public static void main(String[] args) {
		// 키보드로 값을 입력받아 제공하기 위한 Scanner 인스턴스 생성
		Scanner scanner = new Scanner(System.in);

		// 이름과 태어난 연도를 입력받아 저장
		System.out.print("이름 입력 >> ");
		String name = scanner.nextLine();

		System.out.print("태어난 연도 입력 >> ");
		int birthYear = scanner.nextInt();

		
		//java.util.Date 클래스로 인스턴스 생성
		//=> Date 클래스 : 시스템 날짜와 시간정보를 저장할 목적의 클래스
		//=> Date() : 현재 시스템 날짜와 시간정보를 저장하는 인스턴스를 생성하는 생성자
		Date now = new Date();
		
		// 현재년도 반환받아 저장
		//Date.getYear() : 1900년부터 1씩 증가되는 연도값을 반환하는 메소드
		//@Deprecated 어노테이션이 적용된 메소드: 사용 비권장 메소드 >> 더 좋은 메소드가 존재하고 업그레이드 버전에서 에러뜰 가능성
		//@SuppressWarnings(String warning) : 해당 경고 메세지를 제거하는 어노테이션
		@SuppressWarnings("deprecation")
		int currentYear=now.getYear()+1900;

		// 나이를 계산해 저장 : 현재년도 - 태어난 연도 + 1
		//int age = 2019 - birthYear + 1;
		int age = currentYear - birthYear + 1;

		System.out.println("[결과]" + name + "님의 나이는 " + age + "입니다.");

		// 입력장치 제거
		scanner.close();
	}
}
