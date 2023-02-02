package vo;

public class SaleVo {
	private int custno;
	private String custname;
	private String agrade;
	private int psum;
	
	@Override
	public String toString() {
		return "SaleVo [custno=" + custno + ", custname=" + custname + ", agrade=" + agrade + ", psum=" + psum + "]";
	}

	public int getCustno() {
		return custno;
	}

	public String getCustname() {
		return custname;
	}

	public String getAgrade() {
		return agrade;
	}

	public int getPsum() {
		return psum;
	}

	public SaleVo(int custno, String custname, String agrade, int psum) {
		super();
		this.custno = custno;
		this.custname = custname;
		this.agrade = agrade;
		this.psum = psum;
	}

	
	public SaleVo() {
		// TODO Auto-generated constructor stub
	}
}
