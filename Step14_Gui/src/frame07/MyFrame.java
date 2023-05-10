package frame07;

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
		JButton sendBtn = new JButton("전송");
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
		
		JButton deleteBtn = new JButton("삭제");
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
		
		JButton updateBtn = new JButton("수정");
		add(updateBtn);
		updateBtn.addActionListener((e)->{
			System.out.println("수정 버튼을 눌렀네?");
			JOptionPane.showMessageDialog(this, "수정합니다");
		});
		//MyFrame 을 ActionListener
		//전송, 삭제, 수정 버튼 모두다 하나의 리스너 등록하기
		sendBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		
		//각각의 버튼에 action 명령을 설정할 수 있다,
		sendBtn.setActionCommand("send");
		deleteBtn.setActionCommand("delete");
		updateBtn.setActionCommand("update");
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
		//눌러진 버튼의 action command 읽어오기
		String cmd = e.getActionCommand();
		/*
		 *	java에서 문자열의 참조값이 같은지 비교 할때는 비교 연산자 == 를 이용해서 비교하면 되지만
		 *	문자열의 참조값이 아닌 내용이 같으지 비교할때는 String의 .equals() 메소드를 이용해서 비교해야 한다.
		 *
		 *	왜냐하면 java에서는 문자열을 만드는 방법에 따라서 내용은 같지만 참조값이 다르게 나오는 경우도 
		 *	있기 때문이다. 따라서 문자열의 내용이 같은지 정확히 비교 할때는 반드시 .equals() 메소드를
		 *	이용해야 한다.(이걸 까먹으면 밤 셀수도 있음)
		 */
		if(cmd.equals("send")){
			JOptionPane.showMessageDialog(this, "전송합니다");
		}else if(cmd.equals("delete")) {
			JOptionPane.showMessageDialog(this, "삭제합니다");
		}else if(cmd.equals("update")) {
			JOptionPane.showMessageDialog(this, "수정합니다");
		}
	}
}