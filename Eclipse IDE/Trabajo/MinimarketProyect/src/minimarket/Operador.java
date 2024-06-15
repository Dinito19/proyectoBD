package minimarket;
import java.util.Scanner;
public class Operador extends Empleado{
	private String Pedido;
	public Operador(int id, String nombres, String dni, String celular) {
        super(id, nombres, dni, celular);
    }
	// Metodo RecibirPedido
	public String recibirLLamadaCliente(Cliente c,Pedido p) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique su pedido: ");
		String ped = sc.nextLine();
		Pedido = ped;
		System.out.println("Indiqueme La direccion de Entrega: ");
		String DireccionE = sc.nextLine();
		System.out.println("Indiqueme el distrito: ");
		String Distrito = sc.nextLine();
		p.setDireccionEntrega(DireccionE);
		p.setDistrito(Distrito);
		p.setID(01);
		return sb.toString();
	}
	 public String getPed() {
		return Pedido;
	}
	// Método para asignar cliente
    public String asignacionDeCliente(Pedido P, Repartidor R,Moto m) {
        // Lógica para asignar cliente al repartidor según el distrito
    	if(P.getDistrito() == R.getDistritoR()) {
    		System.out.println("Asignando cliente al repartidor " + R.getNombres());
    		R.setMotoId(01);
        	R.setM(m);
        	P.setEstado("Pedido en camino...");
        } else {
            System.out.println("El cliente no se encuentra en el distrito del repartidor.");
        }
    	return "";
    }
    // Método para cobrar sueldo
    public double cobrarSueldoO(double sueldoBase) {
        return sueldoBase; // Operador cobra un monto fijo, no hay impuestos adicionales
    }

   
}
