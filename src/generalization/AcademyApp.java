package generalization;

//�п� �����ڿ�(�л�, ����, ����) ���� ���α׷� 
//
public class AcademyApp {
	/* ���1
	public static void processStudent(AcademyStudnet student) {
		//�п��л������� ���޹޾� ó���ϴ� �޼ҵ�
	}
	
	public static void processInstructor(AcademyInstructor instructor) {
		//�п����������� ���޹޾� ó���ϴ� �޼ҵ�
	}
	
	public static void processStaff(AcademyStaff staff) {
		//�п����������� ���޹޾� ó���ϴ� �޼ҵ�
	}
	*/
	
	
	/* ���2
	//�޼ҵ� �����ε�
	public static void process(AcademyStudent student) {
		//�п��л������� ���޹޾� ó���ϴ� �޼ҵ�
	}
	
	public static void process(AcademyInstructor instructor) {
		//�п����������� ���޹޾� ó���ϴ� �޼ҵ�
	}
	
	public static void process(AcademyStaff staff) {
		//�п����������� ���޹޾� ó���ϴ� �޼ҵ�
	}
	*/
	
	//���3 �θ𿡰� �޾Ƽ� �ڽĿ��� ���� >> ����) �ڽ��ν��Ͻ��� �޼ҵ带 ����ϱ� ���ؼ� ��ü ����ȯ�� �ʿ�
	public static void process(AcademyPerson person) {
		//�п��л�, ����, ���������� ���޹޾� ó���ϴ� �޼ҵ�
		
	}
	
	public static void main(String[] args) {
		
		/*
		// �п��л������� ������ �� �ִ� �޸� ������ �迭�� �Ҵ���� ��
		AcademyStudent[] students = new AcademyStudent[300];
		// �п����������� ������ �� �ִ� �޸� ������ �迭�� �Ҵ���� ��
		AcademyInstructor[] instructors = new AcademyInstructor[50];
		// �п����������� ������ �� �ִ� �޸� ������ �迭�� �Ҵ���� ��
		AcademyStaff[] staffs = new AcademyStaff[100];
		*/
		
		//�θ����������� ����� �л�, ����, ���� ������ ��� �����ϱ� ���� �迭 ����
		AcademyPerson[] personArray = new AcademyPerson[5];
		
		personArray[0]=new AcademyStudent(1000, "ȫ�浿", "���α׷� �������� ����");// �ڽ��ν��Ͻ��� 
		personArray[1]=new AcademyInstructor(2000, "�Ӳ���", "JAVA ����");
		personArray[2]=new AcademyStaff(3000, "����ġ", "����������");
		personArray[3]=new AcademyStudent(4000, "������", "�� ������ ����");
		personArray[4]=new AcademyInstructor(5000, "����", "HTML ����");
		
		for (AcademyPerson person : personArray) {
			//instanceof �����ڷ� �θ����������� ����� �ν��Ͻ��� �ڽ�Ŭ������ ����ȯ ����
			// => ��Ӱ��踦 Ȯ���Ͽ� ��ü ����ȯ 
			if (person instanceof AcademyStudent) {
				//����� ��ü ����ȯ�� �̿��Ͽ� �ڽ��ν��Ͻ��� �޼ҵ� ȣ��
				// => ��Ӱ��谡 �ƴ� Ŭ������ ��ü ����ȯ�� �߻��� ��� ClassCastException �߻�
				System.out.println(((AcademyStudent)person).getCourse()+"�� �л�����");
			} else if (person instanceof AcademyInstructor) {
				System.out.println(((AcademyInstructor)person).getSubject()+"�� ��������");
			} else if (person instanceof AcademyStaff) {
				System.out.println(((AcademyStaff)person).getDepart()+"�� ��������");
			}
			//����� ��ü ����ȯ�� �̿��Ͽ� �ڽ��ν��Ͻ��� �޼ҵ� ȣ��
			// => ��Ӱ��谡 �ƴ� Ŭ������ ��ü ����ȯ�� �߻��� ��� ClassCastException �߻�
			
			
			
			/* �������̵忡 ���� ������ ��ü����ȯ
			�θ��ν��Ͻ��� �޼ҵ� ��� �ڽ��ν��Ͻ��� �޼ҵ� ȣ��
			>> �θ����������� ����� �ڽ��ν��Ͻ��� ���� �ڽ��ν��Ͻ��� �������̵� �޼ҵ� ���� ȣ���
			: �޼ҵ� �������̵忡 ���� ������
			 */
			person.display(); 
			System.out.println("============================================");
		}
		
		/* ���1
		processStudent(new AcademyStudnet());
		processInstructor(new AcademyInstructor());
		processStaff(new AcademyStaff());
		processStudent(new AcademyInstructor());
		*/
		
		//���޵Ǵ� �ν��Ͻ��� ���� �ٸ� �޼ҵ� ȣ�� - �����ε忡 ���� ������
		process(new AcademyStudent());
		process(new AcademyInstructor());
		process(new AcademyStaff());
		
	}
}
