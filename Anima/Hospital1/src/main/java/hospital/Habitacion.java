package main.java.hospital;

public class Habitacion {

	private int numPuerta;
	private int cantCamas;
	private String sector;
	private boolean libre;
	
	public Habitacion(int numPuerta, int cantCamas, String sector, boolean libre) {
		this.numPuerta = numPuerta;
		this.cantCamas = cantCamas;
		this.sector = sector;
		this.libre = libre;
	}
	
	public int getNumPuerta() {
		return numPuerta;
	}
	public void setNumPuerta(int numPuerta) {
		this.numPuerta = numPuerta;
	}
	public int getCantCamas() {
		return cantCamas;
	}
	public void setCantCamas(int cantCamas) {
		this.cantCamas = cantCamas;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public boolean isLibre() {
		return libre;
	}
	public void setLibre(boolean libre) {
		this.libre = libre;
	}
	
	
	
}
