package generalization;

//�⺻���� �������(�����ȣ, ����̸�)�� ������ ������ Ŭ����

public abstract class Employee { //Employee Ŭ������ �ν��Ͻ� ������ ������ �ƴ϶� ����� ������ Ŭ���� > abstractȭ 
	private int empNo;
	private String empName;
	
	//����ʵ�(Constant Field) : ��� ��� ����� �ʵ� > �ʵ尪 ���� �Ұ���
	/* public(�ʵ忡 �߸��� ���� ���� ���� �����Ƿ� private �ʿ�X) 
	static(�ν��Ͻ��� ������� �ϳ��� ����) 
	final(�ʵ尪 ���� �Ұ�)
	�빮�ڿ� _����� ���
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
	
	//�޿��� ����Ͽ� ��ȯ�ϴ� �߻�޼ҵ� >> �ڽ�Ŭ�������� �߻�޼ҵ带 �������̵� ���� ������ �ο�
	//����� �������� �ʰ� �޼ҵ� �ۼ� ��Ģ�� ����(�۾�����)
	//�߻�޼ҵ尡 ����� Ŭ������ �ݵ�� �߻�Ŭ������ �����ؾ���
	public abstract int computePay(); 
	
	
	
	
	//�μ�Ƽ�긦 ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	// => �μ�Ƽ��� ����޿��� 150% 
	//�ڽ�Ŭ�������� �������̵� ������ �� ������(������� �μ�Ƽ�� ������ �ٲ� �� ������) >> final �޼ҵ�� ����
	public final int computeIncentive() {
		//�߻�޼ҵ带 ȣ���ϸ� �θ�Ŭ������ �޼ҵ忡�� �ڽ�Ŭ������ �޼ҵ� ȣ��
		//int incentive=(int)(computePay()*1.5);
		
		
		//��� ��� ����ʵ� ��� - ���� ��Ȯ�ϰ� ����
		int incentive=(int)(computePay()*INCENTIVE_RATE);
		return incentive;
	} 
	
	}

