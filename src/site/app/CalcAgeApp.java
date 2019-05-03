package site.app;

import java.util.Date;
import java.util.Scanner;

//Ű����� �̸��� �¾ ������ �Է¹޾� �̸��� ���̸� ����� ����ϴ� ���α׷�
//ex) �̸� �Է� >> ȫ�浿
//    �¾ ���� �Է� >> 2000
//	  [���]ȫ�浿���� ���̴� 20���Դϴ�.
public class CalcAgeApp {
	public static void main(String[] args) {
		// Ű����� ���� �Է¹޾� �����ϱ� ���� Scanner �ν��Ͻ� ����
		Scanner scanner = new Scanner(System.in);

		// �̸��� �¾ ������ �Է¹޾� ����
		System.out.print("�̸� �Է� >> ");
		String name = scanner.nextLine();

		System.out.print("�¾ ���� �Է� >> ");
		int birthYear = scanner.nextInt();

		
		//java.util.Date Ŭ������ �ν��Ͻ� ����
		//=> Date Ŭ���� : �ý��� ��¥�� �ð������� ������ ������ Ŭ����
		//=> Date() : ���� �ý��� ��¥�� �ð������� �����ϴ� �ν��Ͻ��� �����ϴ� ������
		Date now = new Date();
		
		// ����⵵ ��ȯ�޾� ����
		//Date.getYear() : 1900����� 1�� �����Ǵ� �������� ��ȯ�ϴ� �޼ҵ�
		//@Deprecated ������̼��� ����� �޼ҵ�: ��� ����� �޼ҵ� >> �� ���� �޼ҵ尡 �����ϰ� ���׷��̵� �������� ������ ���ɼ�
		//@SuppressWarnings(String warning) : �ش� ��� �޼����� �����ϴ� ������̼�
		@SuppressWarnings("deprecation")
		int currentYear=now.getYear()+1900;

		// ���̸� ����� ���� : ����⵵ - �¾ ���� + 1
		//int age = 2019 - birthYear + 1;
		int age = currentYear - birthYear + 1;

		System.out.println("[���]" + name + "���� ���̴� " + age + "�Դϴ�.");

		// �Է���ġ ����
		scanner.close();
	}
}
