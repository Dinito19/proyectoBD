package minimarket;

public class Cliente {
    private String dni;
    private String nombres;
    private String celular;
    private String direccion;

    // Constructor
    public Cliente(String dni, String nombres, String celular, String direccion) {
        this.dni = dni;
        this.nombres = nombres;
        this.celular = celular;
        this.direccion = direccion;
    }

    // Getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
