package minimarket;

public class Pedido {
    private Cliente cliente;
    private Repartidor repartidor;
    private double monto;

    // Constructor
    public Pedido(Cliente cliente, Repartidor repartidor, double monto) {
        this.cliente = cliente;
        this.repartidor = repartidor;
        this.monto = monto;
    }

    // Getters y setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
