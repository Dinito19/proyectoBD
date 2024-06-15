package concesionario;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public Automovil(String Marca,String Modelo,String Placa,String MarcaMotor,String SerieMotor,int HP)
		Automovil A1=new Automovil("Toyota","Corolla","RFC-567","Toyota","T-87687",300);
		Automovil A2=new Automovil("Mazda","3","HJI-989","Mazda","M-76576",350);
		Automovil A3=new Automovil("Nissan","Datsun","HJI-8765","Nissan","M-76557",350);
		Camioneta Ca1=new Camioneta("Toyota","HiLux","HGJ-787","Toyota","M-7657",350);
		Moto M1=new Moto("harley davison","H1","UYR-766","Harley","H-765",400);
		
		
		Spoiler S1=new Spoiler();
		S1.setModelo("Standard");
		A1.Arrancar();
		A3.Arrancar();
		A1.setaddSpoiler(S1);
		Ca1.Arrancar();
		
		Concesionario C1=new Concesionario("5454656","Concesionario 01");
		C1.AddAuto(A1);
		C1.AddAuto(A2);
		C1.AddAuto(A3);
		C1.AddAuto(Ca1);
		C1.AddAuto(M1);
		
		//ArrayList<Automovil> encendidos=C1.GetEncendidos();
		//for (Automovil el:encendidos) {
		//	System.out.println(el);
		//}
		
		ArrayList<Automovil> todos=C1.getTodos();
		
		System.out.println(C1);
		for (Automovil el:todos) {
			System.out.println(el);
		}

	}

}
