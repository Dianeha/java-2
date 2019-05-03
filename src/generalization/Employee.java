package generalization;

//기본적인 사원정보(사원번호, 사원이름)를 저장할 목적의 클래스

public abstract class Employee { //Employee 클래스는 인스턴스 생성이 목적이 아니라 상속이 목적인 클래스 > abstract화 
	private int empNo;
	private String empName;
	
	//상수필드(Constant Field) : 상수 대신 사용할 필드 > 필드값 변경 불가능
	/* public(필드에 잘못된 값이 들어올 일이 없으므로 private 필요X) 
	static(인스턴스와 상관없이 하나만 생성) 
	final(필드값 변경 불가)
	대문자와 _쓰기로 약속
	*/
	public static final double INCENTIVE_RATE=1.5;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	//급여를 계산하여 반환하는 추상메소드 >> 자식클래스에서 추상메소드를 오버라이드 선언 강제성 부여
	//기능을 제공하지 않고 메소드 작성 규칙을 제공(작업명세서)
	//추상메소드가 선언된 클래스는 반드시 추상클래스로 선언해야함
	public abstract int computePay(); 
	
	
	
	
	//인센티브를 계산하여 반환하는 메소드
	// => 인센티브는 사원급여의 150% 
	//자식클래스에서 오버라이드 선언할 수 없도록(마음대로 인센티브 비율을 바꿀 수 없도록) >> final 메소드로 선언
	public final int computeIncentive() {
		//추상메소드를 호출하면 부모클래스의 메소드에서 자식클래스의 메소드 호출
		//int incentive=(int)(computePay()*1.5);
		
		
		//상수 대신 상수필드 사용 - 값을 명확하게 구분
		int incentive=(int)(computePay()*INCENTIVE_RATE);
		return incentive;
	} 
	
	}

