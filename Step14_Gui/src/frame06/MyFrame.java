package frame06;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	//필드
	JButton sendBtn;
	JButton deleteBtn;
	JButton updateBtn;
	//생성자
	public MyFrame(String title) {
		super(title);
		//setBounds(x, y, width, height) 창의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
		//이 프레임(MyFrame)의 x 버튼(close 버튼)을 눌렀을때 프로세스도 같이 종료 되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		//전송 버튼의 참조값을 필드에 저장(this.은 생략 가능)
		this.sendBtn = new JButton("전송");
		add(sendBtn);
		
		//ActionListener 인터페이스 type 의 참조값을 얻어내서
		ActionListener listener1 = new ActionListener() {
			//이 리스너를 등록한 UI에 어떤 액션이 발생하면 호출되는 메소드
			@Override
			public void actionPerformed(ActionEvent e) {
			
				System.out.println("전송 버튼을 눌렀네?");
				//JOptionPane.showMessage(프레임의 참조값, 띄울 메세지);
				//클래스명.this 하면 바깥에 있는 클래스로 생성한 객체의 참조값을 가리킬수 있다.
				JOptionPane.showMessageDialog(MyFrame.this, "전송합니다!");
			}
			
		};
		
		//전송 버튼에 등록하기
		sendBtn.addActionListener(listener1);
		
		this.deleteBtn = new JButton("삭제");
		add(deleteBtn);
		/*
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("삭제 버튼을 눌렀네?");
			}
		});
		*/
		
		// ActionListener 인터페이스 type의 참조값을 함수 형태로 전달도 가능
		deleteBtn.addActionListener((e)->{
			System.out.println("삭제 버튼을 눌렀네?");
			//함수 형태의 메소드에서 this 는 바깥 클래스로 생성한 객체의 참조값을 가리킬 수 있다.
			JOptionPane.showMessageDialog(this, "삭제합니다");
		});
		
		this.updateBtn = new JButton("수정");
		add(updateBtn);
		//MyFrame 을 ActionListener
		updateBtn.addActionListener(this);
		//프레임을 화면상에 실제 보이게 하기(false 하면 화면에 보이지 않는다.)
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		//MyFrame 객체 생성
		new MyFrame("나의 프레임");
		System.out.println("main 메소드가 종료 됩니다.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//메소드의 매개변수로 전달되는 ActionEvent 객체에 이벤트에 대한 정보가 들어 있다.
		//이 객체를 활용하면 어떤 버튼이 눌러 졌는지 구별할 수 있다.
		
		//눌러진 버튼의 참조값 얻어오기
//		Object which = e.getSource();
//		if(which == sendBtn) {
//			//전송 버튼을 누른것이다.
//			JOptionPane.showMessageDialog(this, "전송합니다");
//		}
//		if(which == deleteBtn) {
//			JOptionPane.showMessageDialog(this, "삭제합니다");
//		}
//		if(which == updateBtn) {
//			JOptionPane.showMessageDialog(this, "수정합니다");
//		}
		Object which = e.getSource();
		if(which == sendBtn) {
			//전송 버튼을 누른것이다.
			JOptionPane.showMessageDialog(this, "전송합니다");
		}else if(which == deleteBtn) {
			JOptionPane.showMessageDialog(this, "삭제합니다");
		}else if(which == updateBtn) {
			JOptionPane.showMessageDialog(this, "수정합니다");
		}
		
	}
}
