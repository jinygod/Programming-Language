/*
 * MemberVO Value Object
 */
package members;

import java.sql.Date;

public class MemberVO {
	private String mid;
	private String mname;
	private String pwd;
	private String email;
	private Date regdate;

	public MemberVO() {}
	
	public MemberVO(String mid, String mname, String pwd, String email) {
		this.mid = mid;
		this.mname = mname;
		this.pwd = pwd;
		this.email = email;
	}
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

}
