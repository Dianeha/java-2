package realization;

//Java와 Mysql DBMS 시스템을 연결할 목적의 클래스
public class JdbcMysql implements Jdbc {
	@Override	
	public void insert() {
		System.out.println("[삽입] Mysql DBMS를 이용하여 정보를 저장하였습니다.");
	}
	
	@Override	
	public void update() {
		System.out.println("[변경] Mysql DBMS를 이용하여 저장된 정보를 변경하였습니다.");
	}

	@Override	
	public void delete() {
		System.out.println("[삭제] Mysql DBMS를 이용하여 저장된 정보를 삭제하였습니다.");
	}

	@Override	
	public void select() {
		System.out.println("[검색] Mysql DBMS를 이용하여 저장된 정보를 검색하였습니다.");
	}
}
