import java.util.Scanner;

public class Code15 {

	public static void main(String[] args) {
		
		//정수가 입력될 때마다 현재까지 입력된 정수들을 오름차순으로 정렬
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int[n];

		for (int i=0; i<n; i++) {
			//i = 현재까지 입력된 데이터 개수
			//새로 입력된 값을 임의의 공간에 넣어준다.
			int tmp = kb.nextInt();
			
			//가장 마지막부터 역순으로 입력된 값보다 큰지 확인 후 오른쪽으로 shift
			//작은 값이 나타나면 그 자리에 넣어준다.
			//ordered list에 새로운 값을 insert 하는 알고리즘
			
			int j = i-1;
			while (j >=0 && data[j] > tmp) {
				//tmp보다 작거나 같은 값이 나타날 때까지
				data[j+1] = data[j];
				j--;
			}
			//j일 때 작거나 같은 값이 나타난 것이므로 tmp가 들어갈 자리는 j+1 자리
			data[j+1] = tmp;
			
			//현재 데이터의 개수는 i+1개이다.
			for (int k=0; k<=i; k++) {
				System.out.print(data[k] + " ");
			}
			System.out.println();
		}
		kb.close();
		
		
		
	}
}
