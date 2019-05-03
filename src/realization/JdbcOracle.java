package realization;

//Oracle DBMS 시스템을 연결하여 기능을 제공할 목적의 클래스
public class JdbcOracle implements Jdbc {
	
	/*
	public void add() {
		
	}

	public void modify() {
		System.out.println("[변경] Oracle DBMS를 이용하여 저장된 정보를 변경하였습니다.");
	}

	public void remove() {
		System.out.println("[삭제] Oracle DBMS를 이용하여 저장된 정보를 삭제하였습니다.");
	}

	public void search() {
		System.out.println("[검색] Oracle DBMS를 이용하여 저장된 정보를 검색하였습니다.");
	}
	*/

	@Override
	public void insert() {
		System.out.println("[삽입] Oracle DBMS를 이용하여 정보를 저장하였습니다.");
		
	}

	@Override
	public void update() {
		System.out.println("[변경] Oracle DBMS를 이용하여 저장된 정보를 변경하였습니다.");
		
	}

	@Override
	public void delete() {
		System.out.println("[삭제] Oracle DBMS를 이용하여 저장된 정보를 삭제하였습니다.");
		
	}

	@Override
	public void select() {
		System.out.println("[검색] Oracle DBMS를 이용하여 저장된 정보를 검색하였습니다.");
		
	}
}
