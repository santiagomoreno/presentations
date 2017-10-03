package main.java.hospital;

public class Ubicacion {

	private String calle;
	private int numPuerta;
	private String esquina;
	
	public Ubicacion(String calle, int numPuerta, String esquina) {
		this.calle = calle;
		this.numPuerta = numPuerta;
		this.esquina = esquina;
	}
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumPuerta() {
		return numPuerta;
	}
	public void setNumPuerta(int numPuerta) {
		this.numPuerta = numPuerta;
	}
	public String getEsquina() {
		return esquina;
	}
	public void setEsquina(String esquina) {
		this.esquina = esquina;
	}
	
	
}
