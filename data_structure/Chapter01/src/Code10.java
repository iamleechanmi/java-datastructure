
public class Code10 {

	public static void main(String[] args) {
		
		//1~100000 사이 모든 소수
		
		for (int n=2; n<=100000; n++) {
			//2에서부터 n-1 사이의 정수로 n을 나눴을 때 떨어지면 안 된다.
			//그러나 n의 약수가 n/2보다 클 수 없기 때문에 2, 3, ..., n/2까지만 보면 된다.
			
			//소수가 아니기 전에 소수라고 가정한다.
			boolean isPrime = true;
			
			//소수인지 아닌지 검사한다.
			//2)break문을 쓰지 않고 && isPrime 조건을 추가한다.
			//3)root(n)까지만 돌아도 충분하다.
			for (int i=2; i*i<=n && isPrime; i++) { 
				
				//소수가 아닌 게 밝혀지더라도 계속 for문을 돌아야 한다.
				//바로 빠져나오는 게 득이므로 1)if문 안에 break;문을 이용한다.
				if (n%i == 0) {
					//나눠 떨어지면 소수가 아니다.
					isPrime = false;
					//break;
				}
			}
			
			if (isPrime) {
				System.out.println(n);
			}
		}
	}
}
