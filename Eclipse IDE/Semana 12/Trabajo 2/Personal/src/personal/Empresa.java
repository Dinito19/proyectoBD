package personal;

import java.util.ArrayList;

public class Empresa {
	private static final String Ruc;
	private static final String RazonSocial;
	private ArrayList<personal> Personal;
	
	static {
		Ruc = "22222222222";
		RazonSocial = "Tecpro - UPN";
	}
	
	public Empresa () {
		Personal = new ArrayList<>();
		
	}
	public void AddPersonal (personal p) {
		Personal.add(p);
	}
	
}
