package site.app;

//import 명령) 패키지에 존재하는 참조형을 사용할 수 있도록 처리
//import site.uniwill.subject.JavaSubject 패키지가 다른 동일이름의 참조형은 import 처리 불가
import site.itwill.subject.JavaSubject;
import site.itwill.subject.OracleSubject;
import site.uniwill.subject.SpringSubject;

public class SubjectApp {
	public static void main(String[] args) {

		// 참조형은 패키지명을 포함해 사용해야 함
		// 같은 패키지에 선언된 참조형이라면 패키지명을 생략하여 표현 가능
		//site.itwill.subject.OracleSubject subject1 = new site.itwill.subject.OracleSubject();
		
		//import 처리된 참조형은 패키지명을 생략하여 표현
		// => 자동완성 기능(ctrl+space)을 이용해 참조형을 작성한 경우 자동 import 처리
		OracleSubject subject1=new OracleSubject();
		subject1.display();

		SpringSubject subject2=new SpringSubject();
		subject2.display();
		
		//패키지에 동일한 이름의 참조형이 존재할 수 있으므로 import처리에 주의
		JavaSubject subject3=new JavaSubject();
		subject3.display();
		
		//import 처리 불가능한 참조형은 패키지명을 포함해 표현
		site.uniwill.subject.JavaSubject subject4=new site.uniwill.subject.JavaSubject();
		subject4.display();
	}
}
