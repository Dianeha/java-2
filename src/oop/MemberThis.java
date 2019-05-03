package oop;

//ȸ������(���̵�, ��й�ȣ, �̸�)�� ������ ������ Ŭ����
public class MemberThis {
	//�ʵ� �⺻�� >> ������:0, �Ǽ���:0.0, ����:false, ������:null 
	//1) �ʵ忡 ����� �⺻�� �����ϰ� ������ (�ڷ��� �ʵ�� = ��;)���� 
	private String id="guest";
	private String password="1234";
	private String name="���Է�";
	
	public MemberThis() {
		//�����ڿ����� �ʵ� �Ǵ� �޼ҵ� ���� ����
		
		/* 2) id = "guest"; //setId("guest"); ��ɰ� ����
		password = "1234";
		name = "���Է�";
		*/
		
		
		// 3) MemberThis(String id, String password, String name) �⺻������ �� �Ʒ��� ������ ȣ�⵵ ����
		//this("guest", "1234", "���Է�");
	}

	public MemberThis(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name; //�Ķ���Ͷ� �ʵ��̸� ���Ƽ� this �ٿ� �ʵ� ��Ī, this ������ �Ķ����
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; //�Ķ���Ͷ� �ʵ��̸� ���Ƽ� this �ٿ� �ʵ� ��Ī, this ������ �Ķ����/ ���⼭�� �ݵ�� ����ϴ� this
	}
	
	//ȸ�������� ����ϱ� ���� �޼ҵ�
	public void display() {
		//�޼ҵ忡�� �ν��Ͻ� �ʵ� �Ǵ� �޼ҵ忡 �����ϱ� ���� this�� ���
		// System.out.println("���̵� = "+this.id);
		// this Ű���带 �����ص� �ʵ� �Ǵ� �޼ҵ忡 ���� ����
		System.out.println("���̵� = " + id);
		System.out.println("��й�ȣ = " + password);
		System.out.println("�̸� = " + name);
	}
	
}
