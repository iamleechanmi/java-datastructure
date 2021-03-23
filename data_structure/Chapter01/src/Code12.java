import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
		
		//0개 이상의 연속된 정수를 더해 얻을 수 있는 최댓값
		//아무것도 선택하지 않을 수도 있다. 이 때는 최댓값이 0이라 가정한다.
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int[n];
		
		for (int i=0; i<n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		//모든 구간을 검사한다.
		/*
		int max = 0;
		for (int i=0; i<n; i++) {
			for (int j=i; j<n; j++) {
				//data[i] ~ data[j]까지의 합(sum)을 구한다.
				//if the sum > max
				//	max = the sum;
				int sum = 0;
				for (int k=i; k<=j; k++) {
					sum += data[k];
				}
				
				if (sum > max) {
					max = sum;
				}
				
			}
		}
		System.out.println("최댓값 : " + max);
		*/
		//위 방법은 중복된 작업이 있어 효율적이지 않다.
		//구간의 출발점인 i가 정해지면 구간의 끝점인 j가 i에서 출발해 끝까지 도달하면 i를 한칸 전진시켜 반복한다.

		int max = 0;
		for (int i=0; i<n; i++) {
			//구간의 출발점이 바뀔 때 sum을 초기화한다.
			int sum = 0;
			for (int j=i; j<n; j++) {
				//j가 바뀌는 동안 새로 sum을 구하지 않고 그 이전 sum에 현재 데이터를 더하기만 하면 sum을 구할 수 있다.
				sum += data[j];
				
				if (sum > max) {
					max = sum;
				}
				
			}
		}
		System.out.println("최댓값 : " + max);
	}
}
