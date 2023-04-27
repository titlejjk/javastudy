package test.main;

import java.io.File;
import java.util.Scanner;

import test.mypac.Airplane;
import test.mypac.Test;

public class MainClass01 {
	public static void main(String[] args) {
		Test t = new Test();
		//return type 이 void인 메소드 호출
		t.walk();
		//return type 이 int 인 메소드를 호출하고 리턴되는 값을 a라는 int type 지역변수에 담기
		int a = t.getNumber();
		//return type 이 String 인 메소드를 호출하고 리턴되는 값을 b 라는 String type 지역변수에 담기
		String b = t.getGreeting();
		//return type 이 AirPlane 인 메소드를 호출하고 리턴되는 값을 c라는 Airplane type 지역변수에 담기
		Airplane c = t.getPlane();
		c.fly();
		
		// 위에서 생성한 객체의 setNum() 메소드를 호출해 보세요.
		t.setNum(10);
		// 위에서 생성한 객체의 setName() 메소드를 호출해 보세요.
		t.setName("배고프다");
		// 위에서 생성한 객체의 setPlane() 메소드를 호출해 보세요.
		t.setPlane(new Airplane());
		System.out.println("main 메소드가 종료 됩니다.");
		
		t.send();
		t.send(100);
		t.send("배고파");
		Airplane d = new Airplane();
		t.send();
		
		new File("C:/Users/acorn/Desktop/test.txt").delete();
	}
	
}
