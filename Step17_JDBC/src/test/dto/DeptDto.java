package test.dto;
/*
 *	Data Transfer Object
 *
 *	- 여러가지의 정보를 하나의 객체에 담기 위해 설계된 클래스
 *	- 필드의 접근 지정자는 모두 private
 *	- 접근 메소드 setter, getter 메소드가 있어야 한다.
 *	- 디폴트(기본)생성자가 있어야 한다.
 *	- 인자로 필드의 모든값을 전달 받는 생성자도 있어야 한다.(있으면 좋음 option)
 */
public class DeptDto {
	//필드의 접근 지정자를 private로
	private int deptno;
	private String dname;
	private String loc;
	
	//디폴트 생성자
	public DeptDto() {}

	public DeptDto(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	//마우스 우클릭 => source => generate 메뉴에서 constructor 와 setter,getter 메소드 생성 가능
	
}
