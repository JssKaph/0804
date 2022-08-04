// 생성자
public class ConstructorDemo {
	public static void main(String[] args) {
		Employee jimin = new Employee("2022-001", "박지민"); // 괄호가 있으면 매소드 , 객체를 만들면서 이름을 준다
		jimin.setSalary(1000000);
		jimin.setHiredate("2022-08-04");
		jimin.myPrint();
		
		// Math 와 System 같은 클래스는 생성자가 없으므로 new를 사용하지 않는다.
		// 생성자는 특수한 메소드인 3가지 이유가 있다.
	}	// 메소드의 필수요소인 리턴이 없다
		// 이름이 이미 정해져 있다 (클래스랑 똑같이 정해져 있다.)
		// new에 의해서 생성, 생성 하면서 멤버변수 초기화 
		// 
}
