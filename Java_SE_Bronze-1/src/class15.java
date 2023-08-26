
public class class15 {
	public static void main(String[] args) {
		Person person1 = new Person("山田");
		person1.introduce();
		Person person2 = new Person(30);
		person2.introduce();
		Person person3 = new Person("佐藤", 24);
		person3.introduce();
	}
}
 
class Person {
	String name;
	int age;
	
	Person(String name) {
		this.name = name;
		this.age = 999;
	}
	
	Person(int age) {
		this.name = "名無し";
		this.age = age;
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		System.out.println("名前は:" + name + " 年齢は:" + age + "です。");
	}
}
