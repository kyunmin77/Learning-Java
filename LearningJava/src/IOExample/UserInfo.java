package IOExample;

import java.io.Serializable;

public class UserInfo implements Serializable {		// 직렬화 인터페이스
	String name;
	String password;
	int age;
	
	
	public UserInfo() {
		this("Unknown","1111",0);
	}


	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + name + "," + password + "" + age + ")";
	}
	
	
	
}
