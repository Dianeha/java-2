package generalization;

public class EventMemberApp {
	public static void main(String[] args) {
		// �ڽ�Ŭ������ �����ڷ� �ν��Ͻ��� ������ ���
		// Member() ������(��, �θ�Ŭ���� ������) �켱 ���� �� EventMember() ������(�ڽ�Ŭ���� ������) ����
		// => �θ� �ν��Ͻ� ���� �� �ڽ� �ν��Ͻ� ����
		EventMember member1 = new EventMember();

		member1.setEmail("abc@daum.net");
		member1.setName("ȫ�浿");
		member1.setAddress("����� ������");
		//member1.displayEvent();
		member1.display();
		System.out.println("============================================");
		
		EventMember member2 = new EventMember("xyz@naver.com", "�Ӳ���", "������ �ȴޱ�");
		member2.displayEvent();
		System.out.println("============================================");
	}
}

