package java220219;

// 주사위 세 개 
// 상금 구하기 
import java.util.Scanner;

public class b2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A==B && B==C) { // 세 개 다 같을 때 
			System.out.println(10000+A*1000);
		}
		// 두 개 같을 때 
		else if((A==B && B!=C) || (A==C && B!=C)) { 
			System.out.println(1000+A*100);
		}
		else if(B==C && A!=B) {
			System.out.println(1000+B*100);
		}
		else { // 모두 다를 때
			if(A>B && B>C) System.out.println(A*100);
			else if(A>C && C>B) System.out.println(A*100);
			else if(B>A && A>C) System.out.println(B*100);
			else if(B>C && C>A) System.out.println(B*100);
			else if(C>A && A>B) System.out.println(C*100);
			else if(C>B && B>A) System.out.println(C*100);
		}
	}
}