
public class Employee {
	private String empno;
	private String name;
	private int salary;
	private String hiredate;
	
	Employee(String empno, String name){ // 이름이 클래스와 똑같고, 메소드 이지만 return 타입이 없음 => 생성자
		System.out.println("방금 객체가 생성되었습니다.");
		this.empno = empno;
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public void myPrint() {
		System.out.printf("%s, %s, %d, %s\n", this.empno, this.name, this.salary, this.hiredate );
	}
}
