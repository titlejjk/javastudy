package test.mypac;

public class TVRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("TV 채널을 올려요");
	}

	@Override
	public void down() {
		System.out.println("TV 채널을 내려요");
	}
	
	//그런데 ... 나는 내가 사욜할 편리한 메소드를 하나 더 마들고 싶다...
	public void reserve() {
		System.out.println("전원 off를 예약 합니다.");
	}
	
}