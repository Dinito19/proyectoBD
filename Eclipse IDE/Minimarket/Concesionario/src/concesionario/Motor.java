package concesionario;

public class Motor {
	private String Marca;
	private String Serie;
	private int hp;
	private boolean Encendido;
	
	public Motor(String Marca,String Serie,int hp) {
		this.Marca=Marca;
		this.Serie=Serie;
		this.hp=hp;
		
	}
	
	public String getMotor() {
		String result;
		result= "Motor marca: " + this.Marca + " Serie: " + this.Serie + " HP: " + this.hp + System.lineSeparator();
		if (Encendido==true) {
			result=result+ " El motor esta encendido " + System.lineSeparator();
		}
		else {
			result=result+ " El motor esta apagado " + System.lineSeparator();
		}
		return result;
			
	}
	
	public void Encender() {
		if (Encendido==false) {
			Encendido=true;
		}
	}
	
	public void Apagar() {
		if (Encendido==true) {
			Encendido=false;
		}
	}
	
	public boolean getEncendido() {
		return Encendido;
	}
	
	
	

}
