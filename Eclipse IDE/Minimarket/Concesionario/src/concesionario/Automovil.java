package concesionario;

public class Automovil {
	private String Marca;
	private String Modelo;
	private String Placa;
	private Motor motor;
	private Spoiler spoiler;
	
	public Automovil(String Marca,String Modelo,String Placa,String MarcaMotor,String SerieMotor,int HP) {
		this.Marca=Marca;
		this.Modelo=Modelo;
		this.Placa=Placa;
		motor=new Motor(MarcaMotor,SerieMotor,HP);
	}
	
	public void setaddSpoiler(Spoiler s) {
		this.spoiler=s;
	}
	
	public void Arrancar() {
		motor.Encender();
	}
	
	public void Detener() {
		motor.Apagar();
	}
	
	public String toString() {
		String Devolver="";
		String Tipo="El Automovil ";
		if (this instanceof Camioneta) {
			Tipo="La Camioneta ";
		}else if (this instanceof Moto) {
				Tipo="La moto ";
			}
		Devolver=Tipo + "Marca: " + this.Marca + " Modelo: " + this.Modelo + System.lineSeparator();
		Devolver=Devolver+this.motor.getMotor();
		if (this.spoiler != null){
			Devolver=Devolver+this.spoiler.MostrarSpoiler();
		}
		return Devolver;
	}
	
	public Motor getMotor() {
		return motor;
	}
	
	

}
