package minimarket;
import java.util.ArrayList;
public class Pedido {
	
	private int ID;
	private int ClienteID;
	private String DireccionEntrega;
	private String Distrito;
	private String Estado;
	ArrayList<String> Cereales = new ArrayList<>();
	ArrayList<String> Bebidas = new ArrayList<>();
	
	// Constructor
    public Pedido() {
    	
    }
    public String getCereales() {
    	StringBuilder sb = new StringBuilder();
		for(String elem: Cereales){
			sb.append(elem);
		}
		return sb.toString();
	}
	public void AddCereales(String c) {
		Cereales.add(c);
	}
	public String getBebidas() {
    	StringBuilder sb = new StringBuilder();
		for(String elem: Bebidas){
			sb.append(elem);
		}
		return sb.toString();
	}
	public void AddBebidas(String b) {
		Bebidas.add(b);
	}
	
    // Getters y setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public int getClienteID() {
		return ClienteID;
	}

	public void setClienteID(int clienteID) {
		this.ClienteID = clienteID;
	}

	public String getDireccionEntrega() {
		return DireccionEntrega;
	}

	public void setDireccionEntrega(String direccionEntrega) {
		this.DireccionEntrega = direccionEntrega;
	}

	public String getDistrito() {
		return Distrito;
	}

	public void setDistrito(String distrito) {
		this.Distrito = distrito;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		this.Estado = estado;
	}

}
