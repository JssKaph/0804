/*
 * this() : new 없이 생성자를 호출하기 위한 메소드
 * 1. 반드시 생성자 메소드에서만 사용해야 하고
 * 2. 생성자 메소드내의 반드시 첫번째 줄에 와야 한다.
 */

public class ConstructorDemo3 {
	public static void main(String[] args) {
		Sawon jimin = new Sawon(); 
		// 따로 넣으면 하나의 값은 초깃값이 나옴(하나만 넣은 옵션은 쓸모없음) > this() 사용
		System.out.println(jimin.name);
		System.out.println(jimin.salary);
	}
}

class Sawon {
	String name;
	int salary;

	//옵션이 다양하다 안써도되고, 여러개 써도된다.
	public Sawon(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public Sawon(String name) {
		this(name, 5000);
//		this.name = name;
//		new Sawon(name, 50000); // new 를 넣으면 주소가 새로생겨서 값이 안올라옴
	}
	public Sawon(int salary) {
		this("Unknown", salary);
//		this.salary = salary;
//		new Sawon("Unknown", salary);

	}
	public Sawon() {
		this("Unknown", 500000);
//		new Sawon("Unknown", 500000);
	}
}