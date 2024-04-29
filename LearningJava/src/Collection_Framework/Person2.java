package Collection_Framework;

public class Person2 {
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Person2) {
			Person2 temp = (Person2)o;
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
	}
	
	public int hashCode() {
		return (name+age).hashCode();
	}
	public String toString() {
		return name +":"+ age;
	}
	
	
}
