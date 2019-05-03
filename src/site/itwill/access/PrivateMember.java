package site.itwill.access;

class PrivateMember {
	private String name;

	@SuppressWarnings("unused")
	private void display() {
		System.out.println("name = " + name);
	}
	
	
}
