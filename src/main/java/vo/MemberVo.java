package vo;

import java.util.Date;

public class MemberVo {

	private int custno;
	private String custname;
	private String phone;
	private String address;
	private Date joindate;
	private String grade;
	private String city;
	
	public int getCustno() {
		return custno;
	}
	public String getCustname() {
		return custname;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public Date getJoindate() {
		return joindate;
	}
	public String getGrade() {
		return grade;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "memberVo [custno=" + custno + ", custname=" + custname + ", phone=" + phone + ", address=" + address
				+ ", joindate=" + joindate + ", grade=" + grade + ", city=" + city + "]";
	}
	public MemberVo(int custno, String custname, String phone, String address, Date joindate, String grade,
			String city) {
		super();
		this.custno = custno;
		this.custname = custname;
		this.phone = phone;
		this.address = address;
		this.joindate = joindate;
		this.grade = grade;
		this.city = city;
	}
	
	public MemberVo() {
	}
	
}
