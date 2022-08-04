//private 와 public 키워드를 이용하여 자동차를 캡슐화

public class Car {
//	private String name;
//	private int price;
//
//	public void setName(String name) { // 입력 메소드, call by reference
//		this.name = name; // this.name = 지금 자신의 이름 (멤버변수), this가 붙지 않는건 지역변수
//	}
//	public void setPrice(int price) {
//		this.price = price; // this는 주소이기때문에 .을 찍는다
//	}
//	public String getName(){ // 출력 메소드, 파라미터는 필요하지 않는다.
//		return name;
//	}
//	public int getPrice() {
//		return price;
//	}
	
	private String name; 
	private int price; // private 변수만 적어놓으면
	
	//기본 생성자
	public Car() { // 기본생성자는 괄호안에 아무것도 없다.
		System.out.println("방금 객체가 생성 되었습니다.");
	}
	// 이걸 쓰지 않아도 자동으로 생성 해 준다.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// 이클립스 툴을 사용하여 sourse > generate get and set 바로 형성 가능, getter setter

	public void myPrint() {
		System.out.println(this);
	}
}
