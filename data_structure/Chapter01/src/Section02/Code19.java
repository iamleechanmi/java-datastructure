package Section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {

	public static void main(String[] args) {
		
		//파일 읽기
		//만약 해당 이름의 파일이 없는 경우 예외 처리를 해야 한다.
		
		//데이터의 개수가 몇 개인지 모른다. -> 최대 1000명을 넘지 않는다고 가정한다.
		String [] name = new String [1000];
		String [] number = new String [1000];
		//사람 수를 n에 저장한다.
		int n = 0; 
		
		try {
			Scanner inFile = new Scanner(new File("input.txt"));
			
			//전에는 입력 받을 데이터의 개수를 알아 이 부분을 for문으로 입력 받았다.
			//hasNext() 메소드는 더 읽을 게 남아 있으면 true를 리턴한다.
			while (inFile.hasNext()) { //detect End of file
				//첫번째 문자열(사람 이름)을 저장한다.
				name[n] = inFile.next(); 
				number[n] = inFile.next();
				n++;
			}
			
			inFile.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			//return; //프로그램의 종료와 같은 역할을 하는 이유는 메인 메소드 안에 있기 때문이다.
			System.exit(9); //0일 때는 프로그램이 정상적으로 종료되었다는 뜻이다.
		}
		
		for (int i=0; i<n; i++) {
			System.out.println(name[i] + ": " + number[i]);
		}
		
	}
}
