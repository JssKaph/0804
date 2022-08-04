
public class ThisDemo1 {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Lion another = lion.getLion(); // Lion 주소를 another가 받았다.
		System.out.println(another.name);
		System.out.println(another.age);
	}
}
	class Lion{
		String name = "한지민";
		int age = 26;
		Lion getLion(){
			return this; // 자신의 주소 통째로 넘김
		}
	}
