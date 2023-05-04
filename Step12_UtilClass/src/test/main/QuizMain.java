package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		
		
		
		//1. 키보드로 부터 문자열을 입력 받을수 있는 Scanner 객체를 생성해서 scan 이라는 지역변수에 담는다.
		Scanner scan = new Scanner(System.in);
		
		//2. 문자열을 저장할 수 있는 AarryList 객체를 생성해서 msgs 라는 지역 변수에 담는다.
		
		
		ArrayList<String> msgs = new ArrayList<>();
		
		//3. 반복문을 5번 돌리면서 문자열을 5번 입력 받는데 입력받은 문자열을 ArrayList 객체에 순서대로 저장한다.
		for(int i = 0; i < 5; i++) {
			
			System.out.println("문자열 입력 : ");
			String msg = scan.nextLine();
			//입력 받은 문자열을 ArrayList 객체에 누적 시키기
			msgs.add(msg);
			
		}
		for(String tmp : msgs) {
			System.out.println(tmp);
		}
	}
}
