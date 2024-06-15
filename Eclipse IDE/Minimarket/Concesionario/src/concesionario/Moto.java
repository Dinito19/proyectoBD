package concesionario;

public class Moto extends Automovil{
	private int Cilindrada=0;

	public Moto(String Marca,String Modelo,String Placa,String MarcaMotor,String SerieMotor,int HP) {
		super(Marca,Modelo,Placa,MarcaMotor,SerieMotor,HP);
	}
	
	public void setCilindrada(int Cilindrada) {
		this.Cilindrada=Cilindrada;
	}
	
	public int getCilindrada() {
		return Cilindrada;
	}

}
