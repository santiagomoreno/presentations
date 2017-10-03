package main.java.hospital;

public class Cargo {

	private String nombre;
	private int sueldo;
	
	public Cargo(String nombre, int sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
}
