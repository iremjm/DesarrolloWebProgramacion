package ExamenRecu;

import ExamenRecu.Ejercicio4.Oveja;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		Oveja o1=new Oveja();
		Oveja o2=new Oveja();
		Oveja o3=new Oveja();
		o3.setCrotal(89359678);
		o1.setNombre("Juanita");
		o2.setNombre("Peter");
		o3.setNombre("Ricard�n");
		o3.setMadre(o1);
		o3.setPadre(o2);	
		System.out.println(o3.toString());
		System.out.println("La madre es "+ o1.getNombre() + " y el padre es "+ o2.getNombre()+".");
	}

}