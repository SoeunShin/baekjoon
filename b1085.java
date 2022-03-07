package java220307;

// 백준 1085. 직사각형에서 탈출 
import java.util.Scanner;
public class b1085 {
	public static void main() {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int[] distList = {h-y, w-x, x, y};
		
		int min = 100000000;
		for(int i=0; i<4; i++) {
			if (distList[i] > min) min = distList[i];
		}
		System.out.println(min);
	}
}
