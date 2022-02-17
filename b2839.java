// 설탕 배달 
// 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
// 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 
// 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.

package java220217;

import java.util.Scanner;

public class b2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		
		while(true) {
			if(n % 5 == 0) {
				cnt += n/5;
				System.out.println(cnt);
				break;
			}
			else {
				n -= 3;
				cnt++;
			}
			if(n < 0) {
				System.out.println(-1);
				break;
			}
		}
	}
}