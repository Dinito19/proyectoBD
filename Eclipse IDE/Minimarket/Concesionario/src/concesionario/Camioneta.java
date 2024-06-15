package concesionario;

public class Camioneta extends Automovil{
	private int CapacidadCarga=0;
	
	public Camioneta(String Marca,String Modelo,String Placa,String MarcaMotor,String SerieMotor,int HP) {
		super (Marca,Modelo,Placa,MarcaMotor,SerieMotor,HP);
	}
	
	public void setCapacidadCarga(int CapacidadCarga) {
		this.CapacidadCarga=CapacidadCarga;
	}

	public int getCapacidadCarga() {
		return this.CapacidadCarga;
	}
}
