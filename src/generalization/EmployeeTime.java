package generalization;

//시간제 사원정보(사원번호, 사원이름, 시급, 근무시간)를 저장할 목적의 클래스
public class EmployeeTime extends Employee {
	private int moneyPerHour;
	private int workingHour;

	public EmployeeTime() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeTime(int number, String name, int moneyPerHour, int workingHour) {
		super(number, name);
		this.moneyPerHour = moneyPerHour;
		this.workingHour = workingHour;
	}

	public int getMoneyPerHour() {
		return moneyPerHour;
	}

	public void setMoneyPerHour(int moneyPerHour) {
		this.moneyPerHour = moneyPerHour;
	}

	public int getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(int workingHour) {
		this.workingHour = workingHour;
	}

	//급여를 계산하여 반환하는 메소드
	/*public int calcPay() {
		return moneyPerHour*workingHour;
	}
	*/
	
	@Override
	public int computePay() {
		return moneyPerHour*workingHour;
	}
}
