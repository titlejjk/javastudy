package test.main;

import java.io.File;
import java.io.FileWriter;

public class MainClass07 {
	public static void main(String[] args) {
		//파일에 저장할 sample 문자열
		String msg = "안녕하세요";
		
		File f = new File("C:/acorn202304/myFolder/diary.txt");
		
		try {
			if(!f.exists()) {
				//파일을 만든다.
				f.createNewFile();
				System.out.println("diary.txt 파일을 만들었습니다.");
			}
			//파일에 문자열을 출력할 수 있는 객체의 참조값 얻어내기
			//new FileWriter(File 객체, append 모드 여부)
			FileWriter fw = new FileWriter(f);
			fw.write(msg); //출력할 준비
			fw.flush(); //출력
			fw.close(); //마무리
			System.out.println("diary.txt 파일에 문자열을 기록 했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
}
