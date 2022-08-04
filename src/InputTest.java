import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class InputTest {
	Student jimin;

	@Before // 항상 테스트 전에 하는 것
	public void init() {d
		jimin = new Student();
	}
	// 한지민이라고 입력 할 것인데 제대로 저장이 되는지 확인
	@Ignore @Test // annotation,  ignore 무시하기
	public void testInput() {
		Student jimin = new Student();
		Input input = new Input();
		input.input(jimin);
		assertEquals("한지민", jimin.name); // 같음을 보증하는 객체 (기댓값 , 실젯값)
	}

	// 계산을 테스트 할 것
	@Test
	public void testCalc() {
		Calc calc = new Calc();
		jimin.kor = 100; jimin.eng =90; jimin.mat = 80;
		calc.calc(jimin);
//		assertEquals(270, jimin.tot);
//		assertEquals((int)(270/3.), (int)jimin.avg);
		assertEquals('A', jimin.grade);
	}
}
