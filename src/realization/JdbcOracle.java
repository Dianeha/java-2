package realization;

//Oracle DBMS �ý����� �����Ͽ� ����� ������ ������ Ŭ����
public class JdbcOracle implements Jdbc {
	
	/*
	public void add() {
		
	}

	public void modify() {
		System.out.println("[����] Oracle DBMS�� �̿��Ͽ� ����� ������ �����Ͽ����ϴ�.");
	}

	public void remove() {
		System.out.println("[����] Oracle DBMS�� �̿��Ͽ� ����� ������ �����Ͽ����ϴ�.");
	}

	public void search() {
		System.out.println("[�˻�] Oracle DBMS�� �̿��Ͽ� ����� ������ �˻��Ͽ����ϴ�.");
	}
	*/

	@Override
	public void insert() {
		System.out.println("[����] Oracle DBMS�� �̿��Ͽ� ������ �����Ͽ����ϴ�.");
		
	}

	@Override
	public void update() {
		System.out.println("[����] Oracle DBMS�� �̿��Ͽ� ����� ������ �����Ͽ����ϴ�.");
		
	}

	@Override
	public void delete() {
		System.out.println("[����] Oracle DBMS�� �̿��Ͽ� ����� ������ �����Ͽ����ϴ�.");
		
	}

	@Override
	public void select() {
		System.out.println("[�˻�] Oracle DBMS�� �̿��Ͽ� ����� ������ �˻��Ͽ����ϴ�.");
		
	}
}