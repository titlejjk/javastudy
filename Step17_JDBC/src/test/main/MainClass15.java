package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		//삭제할 회원의 정보
		int num = 2;
		
		//위의 정보를 이용해서 회원정보를 삭제하고 성공이면 "삭제 했습니다" 가 출력되도록 해 보세요.
		
		
		MemberDto dto = new MemberDto();
		dto.setNum(num);
		boolean dao = new MemberDao().delete(dto);
		MemberDao select = new MemberDao();
		if(dao) {
			System.out.println("삭제 했습니다.");
		}
		select.select();
	}
}
