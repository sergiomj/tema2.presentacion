package Infraestructuras;

public class Empleados {

	private int empno;
	private String apellido;
	private String oficio;
	private int dir;
	private String fechaalt;
	private float salario;
	private float comision;
	private int deptno;
	
	public Empleados(){
		super();
	}

	public Empleados(int empno, String apellido, String oficio, int dir, String fechaalt, float salario, float comision,
			int deptno) {
		super();
		this.empno = empno;
		this.apellido = apellido;
		this.oficio = oficio;
		this.dir = dir;
		this.fechaalt = fechaalt;
		this.salario = salario;
		this.comision = comision;
		this.deptno = deptno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public String getFechaalt() {
		return fechaalt;
	}

	public void setFechaalt(String fechaalt) {
		this.fechaalt = fechaalt;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getComision() {
		return comision;
	}

	public void setComision(float comision) {
		this.comision = comision;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
	
}
