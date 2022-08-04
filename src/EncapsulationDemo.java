//Car.java 와 연동

public class EncapsulationDemo {
	public static void main(String[] args) {
		Car sonata = new Car();
//		sonata.name = "소나타"; // private 사용하면 입출력이 안된다.
		sonata.setName("소나타"); // "소나타"를 오퍼레이션 메소드 사용하여 대입
//		sonata.price = 30_000_000;
		sonata.setPrice(40_000_000); 
//		System.out.println("이름은 : " + sonata.name + ", 가격은 : " +sonata.price+"원 입니다");
		System.out.println("이름은 : "+sonata.getName() +
				", 가격은 : " + sonata.getPrice()+"원 입니다.");
	}
}
