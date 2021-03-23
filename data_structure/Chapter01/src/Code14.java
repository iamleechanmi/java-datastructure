import java.util.Scanner;

public class Code14 {

	public static void main(String[] args) {
		
		//버블 정렬, 오름차순으로 정렬
		//가장 큰 수를 가장 오른쪽(마지막)에 둔다.
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int[n];
		
		for (int i=0; i<n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		//매 스텝마다 데이터의 개수가 1씩 줄어든다.
		//i = sort 대상인 마지막 데이터의 index
		for (int i=n-1; i>0; i--) {
			//data[0]...data[i]
			for (int j=0; j<i; j++) {
				
				if (data[j] > data[j+1]) {
					//swap data[j] and data[j+1]
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
		
		System.out.println("Sorted data: ");
		for (int i=0; i<n; i++) {
			System.out.println(data[i]);
		}
		
	}
}
