package java220219;

// 재귀함수 - 팩토리얼 
import java.util.Scanner;

public class b10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fac(num));
	}
	public static int fac(int n) {
		if(n == 1 || n == 0) return 1;
		else return n * fac(n - 1);
	}
}