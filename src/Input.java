import java.util.Scanner;

public class Input {
	void input(Student student) {
		Scanner sc = new Scanner(System.in); // 만들면서 키보드 입력을 받는다.
		System.out.print("Name : ");
		String name = sc.nextLine();
//		student.setName(name); // 퍼블릭 메소드로 우회해서 접근
//		student.name = sc.nextLine(); // 직접 접근
		
		
		System.out.print("Hakbun : ");
		String hakbun = sc.nextLine();
		System.out.print("Korean : ");
		int kor = sc.nextInt();
		System.out.print("English : ");
		int eng = sc.nextInt();
		System.out.print("Math : ");
		int mat = sc.nextInt();
		
		// 입력을 받고 생성자 생성
		Student jimin = new Student(hakbun, name, kor, eng, mat); 
		// 학생(Student)을 만들때 순서대로(문법대로) 파라미터를 삽입해야함 ( Student 생성자)
	}
}
