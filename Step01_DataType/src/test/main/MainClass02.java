package test.main;
/*
 *  주석에 표기된것 대로 코딩을 완성해 보세요.
 * */
public class MainClass02 {
	public static void main(String[] args) {
		//1.콘솔창에 "main 메소드가 시작되었습니다."를 출력해보세요.

		System.out.println("main 메소드가 시작되었습니다.");
		//2. 국어점수 95 를 kor 이라는 변수에 담아보세요.
		int kor = 95; //국어점수 95점
		//3. 영어점수 100을 eng 라는 변수에 담아보세요.
		int eng = 100; //영어 점수 100점
		//4. 국어 점수와 영어 점수의 평균을 구해서 avg라는 변수에 담아 보세요.
		double avg = (kor+eng)/2d;
		//5. 콘솔창에 avg변수안에 담긴 내용을 출력해 보세요.
		System.out.println("국어점수와 영어점수의 평균은" + avg + "입니다.");
	}
}
