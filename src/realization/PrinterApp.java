package realization;

public class PrinterApp {
	public static void main(String[] args) {
		// Printable printer = new PrinterSingle();
		Printable printer = new PrinterMulti();
		
		printer.print();
		//�������̵� ������� ������ �������̽��� �޼ҵ� ȣ��
		//�������̵� ����� ��� �ڽ�Ŭ������ �޼ҵ� ȣ��
		printer.scan();
	}
}
