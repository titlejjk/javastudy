package test.mypac;

public class Model {
	public int widthSize;
	public int heightSize;
	
	
	public void makeSquare() {
		System.out.println(" 이 사각형의 넓이는 " + " 폭 " + this.widthSize + " 높이 " + this.heightSize + " 이므로 " + " 이 사각형의 넓이는 " + this.widthSize * this.heightSize + " cm 입니다. ");
	}
}

