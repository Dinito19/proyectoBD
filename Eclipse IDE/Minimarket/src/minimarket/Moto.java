package minimarket;

public class Moto {
    private String marca;
    private String modelo;
    private String placa;
    private Repartidor asignadoA;

    // Constructor
    public Moto(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Repartidor getAsignadoA() {
        return asignadoA;
    }

    public void setAsignadoA(Repartidor asignadoA) {
        this.asignadoA = asignadoA;
    }
}
