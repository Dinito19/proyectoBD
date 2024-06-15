package concesionario;

import java.util.ArrayList;

public class Concesionario {
	private String Ruc;
	private String RazonSocial;
	private ArrayList<Automovil> automovil;
	
	
	public Concesionario (String RUC,String RazonSocial) {
		this.Ruc=RUC;
		this.RazonSocial=RazonSocial;
		this.automovil=new ArrayList<>();
	}
	
	public void AddAuto(Automovil A) {
		automovil.add(A);
	}
	
	public ArrayList<Automovil> GetEncendidos(){
		ArrayList<Automovil> A1=new ArrayList<>();
		for (Automovil el:automovil) {
			if (el.getMotor().getEncendido()) {
				A1.add(el);
			}
		}
		return A1;
	}
	
	public ArrayList<Automovil> getTodos(){
		return this.automovil;
	}
	
	@Override
	public String toString() {
		return " Concesionario: " + this.RazonSocial + System.lineSeparator(); 
	}
	
	
	
	
	
	

}
