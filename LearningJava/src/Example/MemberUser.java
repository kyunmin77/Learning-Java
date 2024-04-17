package Example;

public class MemberUser {
	private String id;
	private int age;
	
	public MemberUser() {}
	public MemberUser(String id, int age) {
		
		this.id= id;
		this.age= age;
	}
	
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
