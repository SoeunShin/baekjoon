package java220218;

// ACM 호텔 
import java.util.Scanner;

public class b10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트 케이스 수 
		
		for (int i=0; i<T; i++) {
			int H = sc.nextInt(); // 층 수 
			int W = sc.nextInt(); // 한 층의 방 수 
			int N = sc.nextInt(); // 몇 번째 손님 
			
			int F; // floor
			int D; // distance 
			
			if(N % H == 0) {
				F = H;
				D = N / H;
			}
			else {
				F = N % H;
				D = N / H + 1;
			}
			
			System.out.println(F*100+D);
		}
	}
}