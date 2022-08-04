import java.util.Date;

public class ConstructorDemo1 {
	public static void main(String[] args) {
		//	Car car = new Car();
		// 기본 생성자
		// 컴파일러가 대신 기본적으로 생성자를 만들어 준다.
		// 괄호 안에 아무것도 없다.
		
		Date now = new Date();
		System.out.println(now);
	}
}

// api 에서 static의 유무
// class 생성자 를 볼 줄 알아야 한다.