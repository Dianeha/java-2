package realization;

//JDBC ���α׷�(Java�� DBMS �ý����� ������ �ۼ��� ���α׷�) 
// => �������̽��� �����Ͽ� �ý��� ���� Ŭ������ �ۼ� - ���յ� ���� ���������� ȿ���� ���� 
public class jdbcApp {
	public static void main(String[] args) {
		/*
		JdbcMysql jdbc = new JdbcMysql();


		jdbc.insert();
		jdbc.delete();
		jdbc.select();
		jdbc.update(); 
		*/
		
		/*
		JdbcOracle jdbc = new JdbcOracle();
		
		jdbc.add();
		jdbc.modify();
		jdbc.remove();
		jdbc.search();
		*/
		
		//�������̽��� �̿��Ͽ� ���������� ������ �ڽ��ν��Ͻ� ����
		//Jdbc jdbc = new JdbcMysql();
		Jdbc jdbc = new JdbcOracle();
		
		//�θ� �������̽��� �ڽ��ν��Ͻ��� �������̵� �޼ҵ� ȣ��
		// => ���������� ����� �ڽ��ν��Ͻ��� ���� �ٸ� �ڽ�Ŭ������ �޼ҵ�
		jdbc.insert();
		jdbc.delete();
		jdbc.select();
		jdbc.update(); 
		
				
		
	}
}
