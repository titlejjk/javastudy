package test.main;

import test.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		//MyUtil 클래스의 send() 메소드 호출해보기
		MyUtil.send();
		//MyUtil 클래스의 version 필드 참조해 보기
		String v = MyUtil.version;
		
		System.out.println();
		//1970sus 1월1일 자정으로 부터 현재까지 경과 시간을 mili second 단위로 얻어내기
		long time=System.currentTimeMillis();
		System.out.println(time/60/60/12/365);
	}
}
