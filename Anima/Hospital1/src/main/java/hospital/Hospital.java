package main.java.hospital;

import java.util.List;

public class Hospital {
	
	private String nombre;
	private int capacidad;
	private List<Funcionario> emplea;
	private List<Habitacion> habitaciones;
	private Ubicacion ubicacion;
	private List<Paciente> atiende;
	
	public Hospital(String nombre, int capacidad, List<Funcionario> emplea, List<Habitacion> habitaciones,
			Ubicacion ubicacion, List<Paciente> atiende) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.emplea = emplea;
		this.habitaciones = habitaciones;
		this.ubicacion = ubicacion;
		this.atiende = atiende;
	}
	
	public int habitacionesDisponibles() {
		int disponibles = 0;
		for (Habitacion h: habitaciones){
			if (h.isLibre()) {
				disponibles++;
			}
		}
		return disponibles;
	}
	
	public int pacientesActuales() {
		return atiende.size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<Funcionario> getEmplea() {
		return emplea;
	}

	public void setEmplea(List<Funcionario> emplea) {
		this.emplea = emplea;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Paciente> getAtiende() {
		return atiende;
	}

	public void setAtiende(List<Paciente> atiende) {
		this.atiende = atiende;
	}
	

}
