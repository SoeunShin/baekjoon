package java220219;

// 재귀함수 - 피보나치 수 
import java.util.Scanner;

public class b10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fibo(num));
	}
	public static int fibo(int n) {
		if(n == 0) return 0;
		else if(n == 1) return 1;
		else return fibo(n-2)+fibo(n-1);
	}
}