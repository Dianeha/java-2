package generalization;

//����� �������(�����ȣ, ����̸�, ���޿�)�� ������ ������ Ŭ����
public class EmployeeContract extends Employee {
	private int contractPay;

	public EmployeeContract() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeContract(int number, String name, int contractPay) {
		super(number, name);
		this.contractPay = contractPay;
	}

	public int getContractPay() {
		return contractPay;
	}

	public void setContractPay(int contractPay) {
		this.contractPay = contractPay;
	}

	
	//�޿��� ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	/*
	public int returnPay() {
			return contractPay;
		}
		*/
	
	@Override
	public int computePay() {
		return contractPay;
	}
}
