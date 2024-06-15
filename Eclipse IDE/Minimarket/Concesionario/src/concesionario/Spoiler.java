package concesionario;

public class Spoiler {
	private String Modelo;
	
	public void setModelo(String modelo) {
		this.Modelo=modelo;
	}
	
	public String MostrarSpoiler() {
		return "Spoiler Modelo:  " + this.Modelo + System.lineSeparator();
	}

}
