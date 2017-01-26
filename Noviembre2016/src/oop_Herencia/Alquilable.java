package oop_Herencia;

public interface Alquilable {//un interface es abstracto, no se puede hacer un new Alquilable.
	public int precio=0;//los trata como constantes
	
	public static final double MAX_PRECIO=100;
	public static final double MIN_PRECIO=10;
	public abstract void setPrecioHora(double precio);
	public abstract double getPrecioHora();

}
