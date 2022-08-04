/*
 * 생성자의 역할은 멤버변수 (필드, Property)의 초기화 << 사용하는 이유
 * 파라미터가 없는 생성자를 기본 생성자라고 한다.
 * 파라미터가 없는 기본 생성자는 어떻게 멤버 변수를 초기화 할 것인가?
 * 기본생성자는 항상 해당 클래스의 생성자가 한 개도 없을 때 자동으로 만들어준다. 
 * 만일 한개라도 생성자가 존재하면 컴파일러는 자동으로 생성하지 않는다.
 */
public class ConstructorDemo2 {
	public static void main(String[] args) {
//		Tiger tiger = new Tiger(); // 기본 생성자
//		System.out.println(tiger.name);
		MyCalendar mc = new MyCalendar();
		System.out.println(mc.year);
		
	}
}
class MyCalendar{
	int year, month, day;
	// 기본 생성자는 컴파일러가 자동으로 만들어준다.
	// 비 현실적인 객체(0년)가 만들어지면 안될 경우에 기본 생성자를 써 줘야한다.
//	public MyCalendar() { // 기본생성자
//		this.year = 2022;
//		this.month = 8;
//		this.day = 4;
		// Overrider (재정의)
	public MyCalendar() {} // 기본생성자 넣으면 오류x
	public MyCalendar(int year) {} // 년도만 쓰기
	public MyCalendar(int year, int month) {} // 년도와 월 쓰기
	// 클래스를 만드는 사람이 입맛대로 할 수 있다.
	public MyCalendar(int year, int month, int day) { // 기본생성자 아님
	this.year = year;
	this.month = month;
	this.day = day;
	// 오류
	// 생성자가 있으면 기본 생성자(default 값)가 자동으로 만들어 지지 않는다.
	}
}

class Tiger{
	// 기본 생성자가 멤버 변수를 초기화 할때 초기값은 다음과 같다
	String name; // null 번지
	int age; //0 
	boolean flag; //false
	double weight; //0.0 
	char grade; //아스키0 '\0', '\u0000'
} 
// 클래스 중요하다 객체 중심 언어이기 때문
