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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//StringBuffer lista=new StringBuffer();
		//return  nombre +":"+nota;
		String lista=nomAlum+"[";
		for(int i=0;i<contAsig;i++){
			lista=lista+asignaturas[i]+",";
			
		}//for
	
	//******************************************************************
		return lista;
		
	}

}
