package main.java.hospital;

import java.util.Date;

public class Paciente {

	private String nombre;
	private String apellido;
	private int ci;
	private Date fechaIngreso;
	private String enfermedad;
	
	public Paciente(String nombre, String apellido, int ci, Date fechaIngreso, String enfermedad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.fechaIngreso = fechaIngreso;
		this.enfermedad = enfermedad;
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

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	
}
