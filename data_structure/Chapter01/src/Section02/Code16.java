package Section02;

import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {
	
		//두 정수 a와 b를 받아 a의 b승을 계산
		//b는 음이 아닌 정수
		
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		//메소드 호출
		int result = power(a, b);
		
		System.out.println(result);
		
		kb.close();
	}

	static int power(int n, int m){
	
		int prod = 1;
		for (int i=0; i<m; i++) {
			prod *= n;
		}
		
		return prod;
	}
}
