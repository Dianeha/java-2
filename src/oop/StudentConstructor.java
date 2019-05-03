package oop;

//�л������� ������ ������ Ŭ���� -VO(value object) Ŭ����
public class StudentConstructor {
	private String number;//�л���ȣ, �ʵ�� ����ȭ��Ű�� ���� ���� > private, ������ �������� ���� �ʴ´ٸ� ���ڿ��� ���� 
	private String name;//�л��̸�
	private String address;//�ּ�
	
	//�⺻������ - �Ķ���Ͱ� ���� ������ : ��� ���ۼ�
	//=> �����ڸ� �ϳ��� �������� ���� ��� �⺻ �����ڰ� �ִ� ������ ó��
	//=> �����ڸ� �ϳ��� ������ ��� ��� ���� ������ �����ϴ� ���� ����
	//Ctrl+Space >> Constructor ���� >> Enter
	
	public StudentConstructor() {
		// TODO Auto-generated constructor stub
	}

	//�Ķ���͸� �ٸ��� �����Ͽ� �޼ҵ� �����ε� �ۼ� ����
	//Alr+Shift+S >> o >> �ʵ弱�� >> Generate
	public StudentConstructor(String number) {
		// ���޵� �Ķ���Ͱ����� �ʵ忡 �ʱⰪ �ο�
		this.number = number;
	}
		
	public StudentConstructor(String number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public StudentConstructor(String number, String name, String address) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
	}

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	//�ʵ尪�� Ȯ���� ������ �޼ҵ�
	public void display() {
		System.out.println("�й� = "+number+", �̸� = "+name+", �ּ� = "+address);
	}
}
