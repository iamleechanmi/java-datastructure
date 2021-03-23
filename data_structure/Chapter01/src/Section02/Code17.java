package Section02;

public class Code17 {

	public static void main(String[] args) {
		
		//1~100000 사이 모든 소수
		for (int n=1; n<=100000; n++) {
			
			//소수이면 true 소수가 아니면 false를 반환하는 메소드 호출
			if (isPrime(n)) {
				System.out.println(n);
			}
		}
	}
	
	static boolean isPrime(int k) {

		if (k<2) {
			return false;
		}
		
		for (int i=2; i*i<=k; i++) {
			if (k%i == 0) {
				//소수가 아닐 경우
				return false; //return : 값을 돌려거나 실행을 종료한다.
			}
		}
		return true;
	}
}
