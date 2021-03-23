import java.util.Scanner;

public class Code9 {

	public static void main(String[] args) {
		
		//오른쪽으로 한칸씩 shift
		//마지막 숫자를 임시 공간에 두고 역순으로 진행하는 게 편하다.
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int[n];
		
		for (int i=0; i<n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		//마지막 값을 temp에 저장한다.
		int temp = data[n-1];
		
		//끝에서 두번째 값부터 첫번째 값까지 한칸씩 shift
		for (int i=n-2; i>=0; i--) {
			data[i+1] = data[i];
		}
		data[0] = temp;
		
		for (int i=0; i<n; i++) {
			System.out.println(data[i]);
		}
	}
}
