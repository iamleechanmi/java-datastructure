package Section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {
	
	//클래스 멤버로 매개변수로 넘겨줄 필요가 없다.
	static String [] name = new String [1000];
	static String [] number = new String [1000];
	static int n = 0; 

	public static void main(String[] args) {
		
		//파일을 읽어 이름을 알파벳 순으로 정렬
		
		try {
			Scanner inFile = new Scanner(new File("input.txt"));
			
			while (inFile.hasNext()) { 
				name[n] = inFile.next(); 
				number[n] = inFile.next();
				n++;
			}
			
			inFile.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			System.exit(9);
		}
		
		bubbleSort();
		
		for (int i=0; i<n; i++) {
			System.out.println(name[i] + ": " + number[i]);
		}
	}
	
	static void bubbleSort() {
		for (int i=n-1; i>0; i--) {
			for (int j=0; j<i; j++) {
				//name[j] > name[j+1]인지 궁금하면 0보다 큰지 검사한다.
				//대소문자 구분 없이 비교할 경우 name[j].compareToIgnoreCase(name[j+1]) > 0
				if (name[j].compareTo(name[j+1]) > 0){
					//swap name[j] and name[j+1]
					String tmp = name[j];
					name[j] = name[j+1];
					name[j+1] = tmp;
					
					//이름을 swap할 때 번호도 함께 swap 해야 한다.
					tmp = number[j];
					number[j] = number[j+1];
					number[j+1] = tmp;
				}
			}
		}
	}
}
