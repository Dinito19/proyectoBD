package personal;

import javax.swing.JOptionPane;

public class personal {
	private String Dni;
	private String Nombres;
	private int Edad;
	
	private void setDni(String Dni) {
		this.Dni = Dni;
	}
	
	private void setNombre(String Nombre) {
		this.Nombres = Nombres;
	}
	
	private void setEdad(int Edad) {
		try {
			if(this.Edad < 18 || this.Edad > 90) {
				throw new Exception ("La edad no esta dentro del rango valido");
			}
			else
				this.Edad = Edad;
		}
		catch (Exception ex)
		{
			JOptionPane.showConfirmDialog(null, " error ", ex.getMessage(),JOptionPane.ERROR_MESSAGE);
		}
	}
}
