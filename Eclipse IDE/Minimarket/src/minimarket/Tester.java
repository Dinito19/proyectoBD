package minimarket;

public class Tester {
    public static void main(String[] args) {
        // Crear instancias
    	Cliente cliente1 = new Cliente("12345678", "Juan Perez", "999888777", "Av. Los Pinos 123");
        Repartidor repartidor1 = new Repartidor(28, "Manuel Chilon", "12345978", "999238777", "Av. Los cedros 678", "Miraflores", null);
        Moto moto1 = new Moto("Honda", "XRE300", "ABC123");

        // Asignar moto al repartidor
        repartidor1.asignacionDeMoto(moto1);

        // Crear instancia de Pedido
        Pedido pedido1 = new Pedido(cliente1, repartidor1, 50.0);

        // Ejemplo de asignación de cliente
        repartidor1.asignacionDeCliente(cliente1);

        double sueldoBaseRepartidor = 3300; // Sueldo base específico para repartidores
        double sueldoRepartidor1 = repartidor1.cobrarSueldo(sueldoBaseRepartidor);
        double impuesto = 0.15 * (sueldoRepartidor1 - sueldoBaseRepartidor);
        double sueldoFinal = sueldoRepartidor1 - impuesto;

        // Imprimir resultados
        System.out.println("Datos del cliente:");
        System.out.println("DNI: " + cliente1.getDni());
        System.out.println("Nombres: " + cliente1.getNombres());
        System.out.println("Celular: " + cliente1.getCelular());
        System.out.println("Dirección: " + cliente1.getDireccion());

        System.out.println("\nDatos del repartidor:");
        System.out.println("ID: " + repartidor1.getId());
        System.out.println("Nombres: " + repartidor1.getNombres());
        System.out.println("DNI: " + repartidor1.getDni());
        System.out.println("Celular: " + repartidor1.getCelular());
        System.out.println("Dirección: " + repartidor1.getDireccion());
        System.out.println("Distrito: " + repartidor1.getDistrito());
        System.out.println("Moto asignada: " + repartidor1.getMoto());

        System.out.println("\nDatos de la moto:");
        System.out.println("Marca: " + moto1.getMarca());
        System.out.println("Modelo: " + moto1.getModelo());
        System.out.println("Placa: " + moto1.getPlaca());
        
        System.out.println("\nDetalles del sueldo del repartidor:");
        System.out.println("Sueldo base: S/ " + sueldoBaseRepartidor);
        System.out.println("Impuesto (15%): S/ " + impuesto);
        System.out.println("Sueldo final: S/ " + sueldoFinal);
    }
}