package generalization;

//학원 인적자원(학생, 강사, 직원) 관리 프로그램 
//
public class AcademyApp {
	/* 방법1
	public static void processStudent(AcademyStudnet student) {
		//학원학생정보를 전달받아 처리하는 메소드
	}
	
	public static void processInstructor(AcademyInstructor instructor) {
		//학원강사정보를 전달받아 처리하는 메소드
	}
	
	public static void processStaff(AcademyStaff staff) {
		//학원직원정보를 전달받아 처리하는 메소드
	}
	*/
	
	
	/* 방법2
	//메소드 오버로드
	public static void process(AcademyStudent student) {
		//학원학생정보를 전달받아 처리하는 메소드
	}
	
	public static void process(AcademyInstructor instructor) {
		//학원강사정보를 전달받아 처리하는 메소드
	}
	
	public static void process(AcademyStaff staff) {
		//학원직원정보를 전달받아 처리하는 메소드
	}
	*/
	
	//방법3 부모에게 받아서 자식에게 전달 >> 단점) 자식인스턴스의 메소드를 사용하기 위해서 객체 형변환이 필요
	public static void process(AcademyPerson person) {
		//학원학생, 강사, 직원정보는 전달받아 처리하는 메소드
		
	}
	
	public static void main(String[] args) {
		
		/*
		// 학원학생정보를 저장할 수 있는 메모리 공간을 배열로 할당받은 것
		AcademyStudent[] students = new AcademyStudent[300];
		// 학원강사정보를 저장할 수 있는 메모리 공간을 배열로 할당받은 것
		AcademyInstructor[] instructors = new AcademyInstructor[50];
		// 학원직원정보를 저장할 수 있는 메모리 공간을 배열로 할당받은 것
		AcademyStaff[] staffs = new AcademyStaff[100];
		*/
		
		//부모참조변수를 만들어 학생, 강사, 직원 정보를 모두 저장하기 위해 배열 선언
		AcademyPerson[] personArray = new AcademyPerson[5];
		
		personArray[0]=new AcademyStudent(1000, "홍길동", "프로그램 웹개발자 과정");// 자식인스턴스를 
		personArray[1]=new AcademyInstructor(2000, "임꺽정", "JAVA 과목");
		personArray[2]=new AcademyStaff(3000, "전우치", "영업관리팀");
		personArray[3]=new AcademyStudent(4000, "일지매", "웹 디자인 과정");
		personArray[4]=new AcademyInstructor(5000, "장길산", "HTML 과목");
		
		for (AcademyPerson person : personArray) {
			//instanceof 연산자로 부모참조변수에 저장된 인스턴스를 자식클래스로 형변환 가능
			// => 상속관계를 확인하여 객체 형변환 
			if (person instanceof AcademyStudent) {
				//명시적 객체 형변환을 이용하여 자식인스턴스의 메소드 호출
				// => 상속관계가 아닌 클래스의 객체 형변환이 발생될 경우 ClassCastException 발생
				System.out.println(((AcademyStudent)person).getCourse()+"의 학생정보");
			} else if (person instanceof AcademyInstructor) {
				System.out.println(((AcademyInstructor)person).getSubject()+"의 강사정보");
			} else if (person instanceof AcademyStaff) {
				System.out.println(((AcademyStaff)person).getDepart()+"의 직원정보");
			}
			//명시적 객체 형변환을 이용하여 자식인스턴스의 메소드 호출
			// => 상속관계가 아닌 클래스의 객체 형변환이 발생될 경우 ClassCastException 발생
			
			
			
			/* 오버라이드에 의한 묵시적 객체형변환
			부모인스턴스의 메소드 대신 자식인스턴스의 메소드 호출
			>> 부모참조변수에 저장된 자식인스턴스에 따라 자식인스턴스의 오버라이드 메소드 각각 호출됨
			: 메소드 오버라이드에 의한 다형성
			 */
			person.display(); 
			System.out.println("============================================");
		}
		
		/* 방법1
		processStudent(new AcademyStudnet());
		processInstructor(new AcademyInstructor());
		processStaff(new AcademyStaff());
		processStudent(new AcademyInstructor());
		*/
		
		//전달되는 인스턴스에 따라 다른 메소드 호출 - 오버로드에 의한 다형성
		process(new AcademyStudent());
		process(new AcademyInstructor());
		process(new AcademyStaff());
		
	}
}
