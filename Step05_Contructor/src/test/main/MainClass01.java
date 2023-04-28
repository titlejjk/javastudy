package test.main;

import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		new Student();
		
		new Student().study();
		
		Student a = new Student();
		a.study();
		a.study();
	}
}
