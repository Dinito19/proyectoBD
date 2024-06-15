package minimarket;

public class Cliente {
	
	private String Dni;
    private String Nombres;
    private String Celular;
    private String Direccion;
    private String Distrito;

    // Constructor
    public Cliente(String dni, String nombres, String celular, String direccion,String distrito) {
        this.Dni = dni;
        this.Nombres = nombres;
        this.Celular = celular;
        this.Direccion = direccion;
        this.Distrito = distrito;
    }

    public String getDistrito() {
		return Distrito;
	}

	public void setDistrito(String distrito) {
		this.Distrito = distrito;
	}

	// Getters y setters
    public String getDni() {
        return Dni;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getCelular() {
        return Celular;
    }

    public String getDireccion() {
        return Direccion;
    }

}
