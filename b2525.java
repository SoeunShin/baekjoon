package java220227;


// 백준 2525. 오븐 시계 
import java.util.Scanner;
public class b2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt() + sc.nextInt();
		
		while(M > 59) {
			H++;
			M -= 60;
		}
		while(H > 23) H -= 24;
		
		System.out.println(H + " " + M);
	}
}