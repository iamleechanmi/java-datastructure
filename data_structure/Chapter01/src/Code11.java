import java.util.Scanner;

public class Code11 {

	public static void main(String[] args) {
		
		//중복된 정수 쌍의 개수 카운트
		//2, 4, 2, 4, 5, 2 의 경우 (2,2), (2,2), (2,2), (4,4)로 모두 4쌍
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int[n];
		
		for (int i=0; i<n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		//모든 쌍을 검사한다. -> i<j 인 순서쌍을 검사하는 것만으로도 충분하다.
		int count = 0;
		for (int i=0; i<n; i++) {
			//1, 1, 2 -> 2 : i=0 j=1/i=1 j=0인 경우 count하는 문제가 발생한다. 하나의 쌍이 2번 count된다.
			for (int j=i+1; j<n; j++) { //2)j를 0이 아니라 i+1부터 시작하게 수정한다.
				//2)어차피 i와 j가 같을 일이 없어지니 i != j 조건을 삭제한다.
				if (data[i] == data[j]) { //1)i와 j가 같지 않다는 조건을 추가한다.
					//1, 2, 3 -> 3 : i와 j가 같은 경우 count하는 문제가 발생한다.
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
