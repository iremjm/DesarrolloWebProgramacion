package EjerciciosENERO.Perimetro;

public class CalculaPerimetro {
	private double radio = 1.0;

	
	public CalculaPerimetro(){
		
	}
	
	public CalculaPerimetro(double radio){
		this.radio = radio;
	
	}
	
	
	//getters & setters por si te apetece cambiar el radio del objeto en instancia
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	
	}
	//calcular perimetro y area
	
	public double calcPerimetro(){//metodo para asignar el perimetro a la variable de instancia: perimetro
		double perimetro = 	(2 * Math.PI) * radio;
		return perimetro;
	}
	
	
	
	public double calcArea(){ //asignamos el area a la variable de instancia:area
		double area = Math.PI * Math.pow(radio, 2);
		return area;
	}

	@Override
	public String toString() {
		return "Valores del Objeto [radio=" + radio + ", Perimetro(cm)=" + calcPerimetro() + ", Area(cm2)=" + calcArea() + "]";
	}

}
