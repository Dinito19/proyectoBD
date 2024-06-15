package minimarket;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancia empleado
		Empleado e1 = new Repartidor(01, "Juan Perez", "72345678", "999888777");
		Empleado e2 = new Repartidor(01, "Luis Diaz", "72345678", "999888777");
		Empleado e3 = new Operador(02, "Pedro Lopez", "70345678", "918078777");
		Repartidor R1 = (Repartidor) e1;
		Repartidor R2 = (Repartidor) e2;
		Operador O1 = (Operador) e3;
		R1.setDistritoR("Miraflores");
		R2.setDistritoR("San isidro");
		//Crear instancia de motos
		Moto moto1 = new Moto("Honda", "XRE300", "ABC123");
		Moto moto2 = new Moto("Suzuki", "AXM200", "STM321");
		//Crear Clientes
		Cliente c1 = new Cliente("12345678", "Juan Perez", "999888777", "Av. Los Pinos 123","Miraflores");
		// Crear instancia de Pedido
        Pedido p1 = new Pedido();
        //Añadimos unos productos de ejemplo:
        p1.AddCereales("Arroz Blanco 1K");
        p1.AddBebidas("Inka cola 1L");
        p1.setClienteID(01);
        O1.recibirLLamadaCliente(c1, p1);
        O1.asignacionDeCliente(p1,R1,moto1);
        System.out.println(R1.EntregaDePedido() + O1.getPed());
        System.out.println("Sueldo total del Repartidor: " + R1.cobrarSueldo(1000));
        System.out.println("Sueldo total del Operador: " + O1.cobrarSueldoO(2000));
	}
}
