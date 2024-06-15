package minimarket;

public class Repartidor extends Empleado {
    private String distrito;
    private String moto;

    // Constructor
    public Repartidor(int id, String nombres, String dni, String celular, String direccion, String distrito, String moto) {
        super(id, nombres, dni, celular, direccion);
        this.distrito = distrito;
        this.moto = moto;
    }

    // Getters y setters
    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    // Método para cobrar sueldo
    public double cobrarSueldo(double sueldoBase) {
        double sueldo = sueldoBase + 5; // Sueldo base + monto fijo por cada pedido repartido
        double impuesto = 0.15 * (sueldo - 3300); // Impuesto del 15% por el monto adicional a 3300
        double sueldoFinal = sueldo - impuesto; // Sueldo final después de impuestos
        return sueldoFinal;
    }

    // Método para asignar cliente
    public void asignacionDeCliente(Cliente cliente) {
        // Verificar si el cliente se encuentra en el mismo distrito que el repartidor
        if (cliente.getDireccion().contains(this.getDistrito())) {
            System.out.println("Asignando cliente al repartidor " + this.getNombres());
        }
    }

    // Método para asignar moto
    public void asignacionDeMoto(Moto moto) {
        // Verificar si la moto está asignada a otro repartidor
        if (moto.getAsignadoA() != null) {
            System.out.println("La moto ya está asignada a otro repartidor.");
        } else {
            this.setMoto(moto.getModelo());
            moto.setAsignadoA(this);
        }
    }
}