package minimarket;

public class Moto {
	
	private String Marca;
    private String Modelo;
    private String Placa;
    private Repartidor asignadoA;

    // Constructor
    public Moto(String marca, String modelo, String placa) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.Placa = placa;
    }

    // Getters y setters
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        this.Placa = placa;
    }

    public Repartidor getAsignadoA() {
        return asignadoA;
    }

    public void setAsignadoA(Repartidor asignadoA) {
        this.asignadoA = asignadoA;
    }
    
}
