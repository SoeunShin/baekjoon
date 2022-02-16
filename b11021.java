// Case #1: 2 형식으로 A+B 출력 

import java.util.Scanner;

public class b11021 {
	public static void main(String[] args) {
		int n, a, b;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.printf("Case #%d: %d\n", i+1, a+b);
		}
	}
}