
// 7개의 피보나치 수열을 출력하시오
// 반복문도 되고 재귀호출도 가능
// 1, 1, 2, 3, 5, 8, 13

public class Practice {
	public static void main(String[] args) {
		for (int i = 0; i <= 7; i++) {
			System.out.print(fibo(i) + "\t");
		}
	}
	static int fibo(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return fibo(n - 1) + fibo(n - 2);
	}
//	public static void main(String[] args) {
//		int before =1;
//		int after =1;
//		int next = 0;
//		for(int i=0; i<7; i++) {
//			System.out.print(before + "\t");
//			next = after+before;
//			before = after;
//			after = next;
//		}
//	}
}
