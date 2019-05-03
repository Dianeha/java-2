package generalization;

//�ð��� �������(�����ȣ, ����̸�, �ñ�, �ٹ��ð�)�� ������ ������ Ŭ����
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

	//�޿��� ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	/*public int calcPay() {
		return moneyPerHour*workingHour;
	}
	*/
	
	@Override
	public int computePay() {
		return moneyPerHour*workingHour;
	}
}
