package calculadora;

public class Calcular {
	private int Operador1;
	private int Operador2;
	
	public void setOperador1(int Operador1) {
	this.Operador1 = Operador1;
	}
	
	public void setOperador2(int Operador2) {
		this.Operador2 = Operador2;
	}
	public int Multiplicar() {
		return this.Operador1 * this.Operador2;
	}
	
	public double Dividir() {
		return this.Operador1 / this.Operador2;
	}
}
