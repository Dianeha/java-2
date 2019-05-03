package generalization;

//������ �������(�����ȣ, ����̸�, ����)�� ������ ������ Ŭ����
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
	
	//�޿��� ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	/*public int computeSalary() {
		return annualSalary/12;
	}
	*/
	
	
	//�߻�޼ҵ尡 ����� �߻�Ŭ������ ��ӹ��� �ڽ�Ŭ���� > ��� �߻�޼ҵ� �������̵� �����ؾ�
	//�߻�޼ҵ带 �������̵� �������� ������ �ڽ�Ŭ������ �߻�޼ҵ�� ó����
	
	@Override
	public int computePay() {
		return annualSalary/12;
	}
	
	}
