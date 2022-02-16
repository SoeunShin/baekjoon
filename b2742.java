// 정수 입력받아 1까지 내림차순으로 출력 

import java.util.Scanner;

public class b2742 {
	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i=n; i>0; i--) {
			System.out.println(i);
		}
	}
}