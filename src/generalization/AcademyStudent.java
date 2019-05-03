package generalization;

//학원학생정보(학생번호, 학생이름, 수강과정)를 저장할 목적의 클래스
public class AcademyStudent extends AcademyPerson {

	private String course;
	
	public AcademyStudent() {
		// TODO Auto-generated constructor stub
	}

	public AcademyStudent(int number, String name, String course) {
		super(number, name);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public void display() {
		System.out.println("학생번호 = "+getNumber());
		System.out.println("학생이름 = "+getName());
		System.out.println("수강과정 = "+course);
	}
}
