package realization;

//DBMS �ý����� �����Ͽ� ����� ������ ������ Ŭ������ �ݵ�� ��ӹ޾ƾ� �ϴ� �������̽�
// => ��ӹ��� Ŭ������ �޼ҵ� �ۼ� ��Ģ ����
public interface Jdbc {
	void insert();

	void update();

	void delete();

	void select();
}
