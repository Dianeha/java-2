package generalization;

//정규직 사원정보(사원번호, 사원이름, 연봉)를 저장할 목적의 클래스
public class EmployeeRegular extends Employee {
	private int annualSalary;

	public EmployeeRegular() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeRegular(int number, String name, int annualSalary) {
		super(number, name);
		this.annualSalary = annualSalary;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	//급여를 계산하여 반환하는 메소드
	/*public int computeSalary() {
		return annualSalary/12;
	}
	*/
	
	
	//추상메소드가 선언된 추상클래스를 상속받은 자식클래스 > 모든 추상메소드 오버라이드 선언해야
	//추상메소드를 오버라이드 선언하지 않으면 자식클래스도 추상메소드로 처리됨
	
	@Override
	public int computePay() {
		return annualSalary/12;
	}
	
	}
