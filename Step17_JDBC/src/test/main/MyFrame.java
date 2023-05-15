package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	JTextField tf_num, tf_name, tf_addr;
	public MyFrame(String title) {
		super(title);
		
		setBounds(100, 100, 900, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		tf_num = new JTextField(10);
		tf_name = new JTextField(10);
		tf_addr = new JTextField(10);
		
		JButton saveBtn = new JButton("저장");
		
		add(tf_num); //회원번호입력
		add(tf_name); //회원이름 입력
		add(tf_addr); //회원주소 입력
		add(saveBtn); //저장버튼
		
		saveBtn.addActionListener(this);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("회원정보 수정하기"); //창이름
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		Connection conn = null;
		
		try {
	         //오라클 드라이버 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         //접속할 DB 의 정보 @아이피주소:port번호:db이름
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e1) {
	         e1.printStackTrace();
	      }
		PreparedStatement pstmt = null;
		
		String strNum = tf_num.getText(); //문자열가져오기
		String strName = tf_name.getText();
		String strAddr = tf_addr.getText();
		
		
		try {
			int memNum = Integer.parseInt(strNum); //가져온 문자열을 숫자로 변환
			
			String cmd = e.getActionCommand();
			
			if(cmd.equals("저장")) {
				try {
					String sq1 = "INSERT INTO member"
							+ " (num, name, addr)"
							+ " VALUES(? ,?, ?)";
					
					pstmt = conn.prepareStatement(sq1);
					
					pstmt.setInt(1, memNum);
					pstmt.setString(2, strName);
					pstmt.setString(3, strAddr);
					
					pstmt.executeUpdate();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		} catch (Exception e3) {
			e3.printStackTrace();
		}
		System.out.println("회원정보 수정이 완료 되었습니다.");
	}
}
