package testing1;

public class Person implements Comparable<Person>{

	private String name;
	private String mobile;
	private int age;
	
	/*public Person() {
		
	}*/
	public Person(String name, String mobile, int age) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", mobile=" + mobile + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		if(o.getAge()>this.age) {
			return 1;
		}else if(o.getAge()==this.age) {
			return 1;
		}else {
			return -1;
		}

	}
	
	
	
}
