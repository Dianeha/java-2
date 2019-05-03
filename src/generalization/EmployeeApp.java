package generalization;

//��������� �̿��� �޿� ���� ���α׷�
public class EmployeeApp {
	public static void main(String[] args) {
		
		//Employee emp1 = new Employee();  ����� �������� �ϴ� �߻�Ŭ������ ������ ��� �ν��Ͻ� ���� �Ұ���
		//Employee emp2 = new EmployeeRegular();
		//Employee emp3 = new EmployeeTime();
		//Employee emp4 = new EmployeeContract();
		
		Employee[] employeeArray = new Employee[5];
		
		employeeArray[0] = new EmployeeRegular(1000, "ȫ�浿", 96000000);
		employeeArray[1] = new EmployeeTime(2000, "�Ӳ���", 50000, 150);
		employeeArray[2] = new EmployeeContract(3000, "����ġ", 7000000);
		employeeArray[3] = new EmployeeTime(4000, "������", 10000, 100);
		employeeArray[4] = new EmployeeRegular(5000, "����", 96000000);
		
		
		for (Employee employee : employeeArray) {
			
			System.out.println("�����ȣ = "+employee.getEmpNo());
			System.out.println("����̸� = "+employee.getEmpName());
						
			/*
			//�������̵尡 ���� ����� ��ü����ȯ�� �̿� > �ڽ��ν��Ͻ��� �޼ҵ� ȣ��
			//instanceof �����ڸ� �̿��Ͽ� �ڽ�Ŭ������ ������ �� ����� ��ü����ȯ
			if (employee instanceof EmployeeRegular) {
				System.out.println("����޿� = " + ((EmployeeRegular) employee).computeSalary());
			} else if (employee instanceof EmployeeTime) {
				System.out.println("����޿� = " + ((EmployeeTime) employee).calcPay());
			} else if ((employee instanceof EmployeeContract)) {
				System.out.println("����޿� = " + ((EmployeeContract) employee).getContractPay());
			}
			*/
			
			//������ ��ü����ȯ�� �̿��� �ڽ��ν��Ͻ��� �޼ҵ� ȣ��
			//=> �θ�Ŭ������ �߻�޼ҵ带 �ڽ�Ŭ�������� �������̵� ����
			System.out.println("����޿� = "+employee.computePay());

			System.out.println("�μ�Ƽ�� = "+employee.computeIncentive());
			System.out.println("========================================");
		}
	}
}
