package minimarket;

public class Empleado {
    private int id;
    private String nombres;
    private String dni;
    private String celular;
    private String direccion;

    // Constructor
    public Empleado(int id, String nombres, String dni, String celular, String direccion) {
        this.id = id;
        this.nombres = nombres;
        this.dni = dni;
        this.celular = celular;
        this.direccion = direccion;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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


