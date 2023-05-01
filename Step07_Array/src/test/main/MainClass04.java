package test.main;

import test.mypac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		
	/*
	 *  1. Bike 객체를 담을 수 있는 방 3개짜리 배열객체를 생성해서 참조값을
	 *     bike 라는 지역 변수에 담아보세요.
	 *  2. 배열의 각각의 방 (0,1,2번)에 Bike 객체를 생성해서 담아보세요.
	 *  3. 반복문 for를 이용해서 순서대로 배열의 각각의 방에 있는 Bike객체의 ride() 메소드를 호출해 보세요.
	 *
	 */
		Bike[] bike = new Bike[3];
		bike[0] = new Bike();
		bike[1] = new Bike();
		bike[2] = new Bike();
		
		for(int i = 0; i < bike.length; i++) {
			//i번째 방에 있는 Bike 객체의 참조값을 얻어와서 임시변수 tmp에 담기
			Bike tmp = bike[i];
			//객체의 참조값이 들어있는 tmp에 . 을 입력하고 메소드 호출
			bike[i].ride();
		}
		System.out.println("--- 확장 for 문을 사용하면 ---");
		for(Bike tmp:bike) {
			tmp.ride();
		}
		
	}
}