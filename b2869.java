package java220221;

// 달팽이는 올라가고 싶다 

/*
이 방법으로 풀면 시간초과가 나온다.
import java.util.Scanner;

public class b2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// day가 double형이기 때문에 int로 선언하면 day 계산이 제대로 되지 않아 double형으로 바꿨다.
		double A = sc.nextInt();
		double B = sc.nextInt();
		double V = sc.nextInt();
		
		int day = (int)Math.ceil((V-A) / (A-B)) + 1;
		System.out.println(day);
	}
}
*/

// 시간 제한이 아주 짧은 문제이므로 BufferedReader를 쓰는 것이 좋다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class b2869{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		double A = Integer.parseInt(st.nextToken());
		double B = Integer.parseInt(st.nextToken());
		double V = Integer.parseInt(st.nextToken());
		
		/*
		 * 나무 높이를 기준으로 식을 세워보면 (A-B) * N + A = V가 된다.
		 * 이를 N에 대한 식으로 나타내면 
		 */
		int day = (int)Math.ceil((V-A) / (A-B)) + 1;
		
		System.out.println(day);
	}
}