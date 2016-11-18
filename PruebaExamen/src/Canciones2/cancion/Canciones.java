package Canciones2.cancion;

public class Canciones {
	//Atributos
	//definimos static para crear el objeto de la clase
	private static final int MAX_ESTILOS=5;
	private String titulo;
	private String autor;
	private String [] estilos=new  String [MAX_ESTILOS];
	int contEstilos=0;
	private double duracion;
	private boolean escuchada;
	
	//Metodo constructor
			public Canciones(String titulo){
				this.titulo=titulo;
			}
	//Getter and setter
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void addEstilo(String estilo){//Añadimos el estilo
		if(contEstilos<MAX_ESTILOS){
		estilos[contEstilos]=estilo;
		contEstilos++;
		}//if
	}
	//Devolvemos estilos del array separado por un espacio
	public String getEstilos(){
		StringBuilder sbEstilos = new StringBuilder("");
		for(int i=0;i<contEstilos;i++){
			sbEstilos.append(estilos[i]);//añadimos el estilo.
			sbEstilos.append(" ");//añadimos el espacio
		}
		//se pasa a string y contrim se elimina espacios de los lados
		return sbEstilos.toString().trim();
	}
	
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public boolean isEscuchada() {
		return escuchada;
	}
	public void setEscuchada(boolean escuchada) {
		this.escuchada = escuchada;
	}
	@Override
	public String toString() {
		
		return autor + "-" + titulo;
	}
	
}