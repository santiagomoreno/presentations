package main.java.hospital;

public class Funcionario {
	
	private int num;
	private String nombre;
	private String apellido;
	private int ci;
	private Cargo ocupa;
	
	public Funcionario(int num, String nombre, String apellido, int ci, Cargo ocupa) {
		this.num = num;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.ocupa = ocupa;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public Cargo getOcupa() {
		return ocupa;
	}

	public void setOcupa(Cargo ocupa) {
		this.ocupa = ocupa;
	}
	
	

}
