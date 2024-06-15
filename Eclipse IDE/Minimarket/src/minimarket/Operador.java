package minimarket;

public class Operador extends Empleado {
    // Constructor
    public Operador(int id, String nombres, String dni, String celular, String direccion) {
        super(id, nombres, dni, celular, direccion);
    }

    // Método para cobrar sueldo
    public double cobrarSueldo(double sueldoBase) {
        return sueldoBase; // Operador cobra un monto fijo, no hay impuestos adicionales
    }

    // Método para asignar cliente
    public void asignacionDeCliente(Cliente cliente, Repartidor repartidor) {
        // Lógica para asignar cliente al repartidor según el distrito
        if (cliente.getDireccion().contains(repartidor.getDistrito())) {
            System.out.println("Asignando cliente al repartidor " + repartidor.getNombres());
            // Aquí podrías tener lógica adicional, como agregar el cliente a una lista de clientes asignados al repartidor.
        } else {
            System.out.println("El cliente no se encuentra en el distrito del repartidor.");
        }
    }
}