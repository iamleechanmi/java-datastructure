import java.util.Scanner;

public class Code13 {

	public static void main(String[] args) {
		
		//1개 이상의 연속된 정수들을 합해 얻을 수 있는 소수 중 최댓값
		//여기서 합하는 것은 덧셈이 아니다. 7 1 3 -> 713
		//1 9 4 0 7 1 3 6 2 3 으로 음이 아닌 한 자리 정수를 입력 받는다.
		//이때 최댓값은 713이다.
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int[n];
		
		for (int i=0; i<n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		//i는 구간의 출발점이다.
		int max = 0;
		for (int i=0; i<n; i++) {
			for (int j=i; j<n; j++) {
				//convert data[i]...data[j] into an integer
				//1. value = 0; 초기화
				//2. 새로운 digit를 읽을 때마다 현재의 value에 10을 곱하고 새로운 digit를 더하면 된다.
				//3. value = 현재 value * 10 + 마지막 숫자;
				int value = 0; //2)정수형 변수는 32bit까지 저장할 수 있으므로 문제가 있다. 대략 10^9
				for (int k=i; k<j; k++) {
					value = value * 10 + data[k];
				}
				
				//test if it is a prime
				boolean isPrime = true;

				for (int k=2; k*k<=value && isPrime; k++) {
					if (value % k == 0) {
						isPrime = false;
					}
				}
				
				//if true, compare to the max
				//1)value=1일 경우 위의 for문에 들어가지 않아 isPrime이 true인 상태가 된다.
				//소수가 1일 수 없으므로 value가 1보다 크다는 조건을 추가한다.
				if (isPrime && value > 1 && value > max) { 
					max = value;
				}
			}
		}
		
		if (max > 0) {
			System.out.println("max : " + max);
		} else {
			System.out.println("no prime number");
		}
		
	}
}
