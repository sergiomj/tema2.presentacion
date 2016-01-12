package ejemplo;

public class Departamentos {
	
	
	private byte deptno;
	private String dnombre;
	private String loc;
	

	public Departamentos() {
		super();
	}
	
	public Departamentos(byte deptno, final String dnombre, final String loc) {
		super();
		this.deptno = deptno;
		this.dnombre = dnombre;
		this.loc = loc;
	}

	public byte getDeptno() {
		return deptno;
	}

	public void setDeptno(byte deptno) {
		this.deptno = deptno;
	}

	public String getDnombre() {
		return dnombre;
	}

	public void setDnombre(String dnombre) {
		this.dnombre = dnombre;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}


	
}
