package generalization;

//학원인적자원의 공통적인 속성과 기능을 정의하기 위한 클래스
//학원사람정보(번호, 이름)를 저장
//학원인적자원 관련 클래스가 반드시 상속받아야 되는 클래스
public abstract class AcademyPerson {
	private int number;
	private String name;
	
	public AcademyPerson() {
		// TODO Auto-generated constructor stub
	}

	public AcademyPerson(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("번호 = "+number);
		System.out.println("이름 = "+name);
	}
}