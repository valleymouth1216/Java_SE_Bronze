public class class14 {
 
	public static void main(String[] args) {
		Person person = new Person();
		person.setInfo("山田");
		person.setInfo(30);
		person.setInfo("佐藤", 24);
	}
}
 
class Person {
	String name;
	int age;
	
	public void setInfo(String name) {
		this.name = name;
		System.out.println("nameを" + name + "に上書きしました。");
	}
	
	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("nameを" + name +  " ageを" + age +  "に上書きしました。");
	}
	
	public void setInfo(int age) {
		this.age = age;
		System.out.println("ageを" + age + "に上書きしました。");
	}
	
}
