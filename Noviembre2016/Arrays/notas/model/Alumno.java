package notas.model;

public class Alumno {
	//definimos las variables
	private static final int MAX_ASIG=10;
	private String nomAlum;
	private  Asignatura [] asignaturas=new Asignatura[MAX_ASIG];
	private int contAsig=0;
	//Metodos
	//Metodo constructor
	public Alumno (String nomAlum){
		this.nomAlum=nomAlum;
	}//Alumno
	public String getNomAlum() {
		return nomAlum;
	}
	//Metodos getter and setter
	public void setNomAlum(String nomAlum) {
		this.nomAlum = nomAlum;
	}
	public void addAsig(Asignatura asig){
		
		if(contAsig<MAX_ASIG){
			asignaturas[contAsig]=asig;
			contAsig++;
		}//if
		else{
			System.out.println("NO se puede matricular");
		}
	}//addAsignatura
	public void addAsig(String nomAsig, double nota){
	
		//comprobar si no se puede matricula de m�s asignaturas
		if(contAsig<MAX_ASIG){
			//crear una asignatura con los datos de los par�metros
			Asignatura asig1=new Asignatura(nomAsig);
			asig1.setNota(nota);
			//a�adir la asignatura creada al array de asignaturas
			asignaturas[contAsig]=asig1;
			//incrementar el n�mero de asignaturas
			contAsig++;
			
		}//if
		else{
			System.out.println("NO se puede matricular");
		}
	}//addAsig2
	@Override 
		public String toString() {
		// TODO Auto-generated method stub
		//StringBuffer lista=new StringBuffer();
		//return  nombre +":"+nota;
		String lista=nomAlum+"[";
		for(int i=0;i<contAsig;i++){
			lista=lista+asignaturas[i]+",";
			
			
		}//for
		lista=lista+"]";
		return lista;
	}//toString
	
	public boolean equals(Alumno al) {
		// TODO Auto-generated method stub
		if(this.nomAlum.equals(al.nomAlum)){
			return true;
		
		}//if
		else{
			return false;
		}//else
			
		
	}//equals
	//devuelve la media del alumno
	public double getMedia (){
		double sumaNota=0;
		double resultado=0;
		for(int i=0; i<asignaturas.length; i++){
			sumaNota=sumaNota+asignaturas[i].getNota();
	}
		resultado=sumaNota/contAsig;
		return  resultado;
		
	}
	/*//devuelve la asignatura con mejor nota
	public Asignatura getMejorAsignatura(){
		
	}
	//elimina todas las asignaturas
	public void delExpediente(){
		
	}
	//devuelve un array de asignatura
	public Asignatura[] getAsignaturas(){
		
	}*/

}
