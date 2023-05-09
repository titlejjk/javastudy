package test.main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *	현재 존재하거나 혹은 존재하지 않는 파일이나 폴더를 제어 할 수 있는 File 객체를 생성해서
		 *	참조값을 f 라는 지역변수에 담기
		 */
		File f = new File("c:/acorn202304/myFolder/memo.txt");
		
		//File 객체의 메소드를 활용해서
		//실제 memo.txt 파일이 존재하지 않으면 파일을 만들고
		//존재하면 memo.txt 파일을 삭제하도록 프로그래밍해 보세요.
		Scanner scan = new Scanner(System.in);
		if(f.exists() == false) {
			System.out.println("파일이 존재하지 않아 새롭게 생성하겠습니다.");
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("파일이 존재해 기존 파일을 삭제 하겠습니다.");
			f.delete();
		}
	}
}
