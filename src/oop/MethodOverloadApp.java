package oop;

public class MethodOverloadApp {
public static void main(String[] args) {
	MethodOverload overload=new MethodOverload();
	
	overload.displayInt(100);
	overload.displayBoolean(false);
	overload.displayString("ȫ�浿");
	//�Ķ���Ϳ� ���� �Ұ����� ���� ������ ��� �޼ҵ� ȣ�� �Ұ���
	//overload.displayInt(true);
	System.out.println("==========================================");

	//�Ķ���Ϳ� ���޵Ǵ� ���� ���� �޼ҵ��� ������ ȣ�� ����
	//=>�����ε忡 ���� ������
	overload.display(200);
	overload.display(true);
	overload.display("�Ӳ���");
	System.out.println("==========================================");
}
}
