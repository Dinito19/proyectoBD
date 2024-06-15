package minimarket;

public class Repartidor extends Empleado{
	
	private float MontoporPedido;
	private int motoId;
	private String DistritoR;
	private Moto M;

	// Constructor
    public Repartidor(int id, String nombres, String dni, String celular) {
        super(id, nombres, dni, celular);
    }
	// Getters y setters
    public float getMontoporPedido() {
		return MontoporPedido;
	}

	public String getDistritoR() {
		return DistritoR;
	}
	public void setDistritoR(String distritoR) {
		this.DistritoR = distritoR;
	}
	public void setMontoporPedido(float montoporPedido) {
		MontoporPedido = montoporPedido;
	}

	public int getMotoId() {
		return motoId;
	}

	public void setMotoId(int motoId) {
		this.motoId = motoId;
	}
	public Moto getM() {
		return M;
	}
	public void setM(Moto m) {
		M = m;
	}
	
	public String EntregaDePedido() {
		System.out.println("Felcidades : Aqui tiene el pedido que solicito: ");
		return "";
	}
    // Método para cobrar sueldo
    public double cobrarSueldo(double sueldoBase) {
        double sueldo = sueldoBase + 5; // Sueldo base + monto fijo por cada pedido repartido
        double impuesto = 0.15 * (sueldo - 3300); // Impuesto del 15% por el monto adicional a 3300
        double sueldoFinal = sueldo - impuesto; // Sueldo final después de impuestos
        return sueldoFinal;
    }

}
