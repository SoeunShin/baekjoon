package java220224;

// 백준 2920. 음계 
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class b2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[8]; // 크기가 8인 배열 생성 
		int[] asc = new int[8];	// 오름차순 
		Integer[] dsc = new Integer[8];	// 내림차순
		
		for(int i=0; i<8; i++) { // 입력받은 숫자를 배열에 저장 
			arr[i] = sc.nextInt();
			asc[i] = arr[i];
			dsc[i] = arr[i];
		}
		
		Arrays.sort(asc);
		Arrays.sort(dsc, Collections.reverseOrder()); //dsc 배열의 타입을 int가 아닌 Integer로 설정해야 에러가 안 남 
		
		int asc_check = 0;
		int dsc_check = 0;
		
		for(int i=0; i<8; i++) { // ascending인지 확인 
			if(arr[i] != asc[i]) {
				asc_check = 1;
				break;
			}
		}
		for(int i=0; i<8; i++) { // descending인지 확인 
			if(arr[i] != dsc[i]) {
				dsc_check = 1;
				break;
			}
		}
		
		if (asc_check == 0) System.out.println("ascending");
		else if (dsc_check == 0) System.out.println("descending");
		else System.out.println("mixed");
	}
}
