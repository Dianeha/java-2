package realization;

public class WolfHumanApp {
	public static void main(String[] args) {
		WolfHuman wh = new WolfHuman();

		wh.speak();
		wh.walk();
		wh.change();
		wh.cryLoudly();
		wh.fastWalk();
		wh.change();
		System.out.println("=====================================");

		// �θ�Ŭ������ ���������� �����Ͽ� �ν��Ͻ��� ������ ��� �θ�Ŭ������ �޼ҵ� ����
		Human human = new WolfHuman();

		human.speak();
		human.walk();

		// ����� ��ü ����ȯ�� �̿��� �ڽ� Ŭ������ �޼ҵ� ȣ�� ����
		((WolfHuman) human).change();
		System.out.println("=====================================");

		// �ڽ�Ŭ������ ������ ��� �θ�Ŭ������ ���������� �ڷ����� �θ��������̽� �ڷ�������
		// ����� ��ü ����ȯ ����
		Wolf wolf = (Wolf)human;
		
		wolf.cryLoudly();
		wolf.fastWalk();
		
		System.out.println("=====================================");
	}
}
