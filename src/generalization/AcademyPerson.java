package generalization;

//�п������ڿ��� �������� �Ӽ��� ����� �����ϱ� ���� Ŭ����
//�п��������(��ȣ, �̸�)�� ����
//�п������ڿ� ���� Ŭ������ �ݵ�� ��ӹ޾ƾ� �Ǵ� Ŭ����
public abstract class AcademyPerson {
	private int number;
	private String name;
	
	public AcademyPerson() {
		// TODO Auto-generated constructor stub
	}

	public AcademyPerson(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("��ȣ = "+number);
		System.out.println("�̸� = "+name);
	}
}