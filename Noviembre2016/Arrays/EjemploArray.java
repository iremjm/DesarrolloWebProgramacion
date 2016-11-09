public class EjemploArray {
	public static final int MAX_NOTAS=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Imprimir por pantalla los elementos del array
		//Definicion 
		int[] tNotas={5,4,8,10};
		//Imprimir elementos del array
		System.out.print("[");
		for(int i=0;i<tNotas.length-1;i++){
			System.out.print(tNotas[i]+",");
		}
		System.out.print(tNotas[tNotas.length-1]+"]");
		
		/*//definicion
		int [] notas=new int[MAX_NOTAS];
		//insertar elementos
		notas[0]=5;
		//obtener elementos
		System.out.println(notas[0]);
		//obtener la cantidad de elementos del array
		System.out.println(notas.length);*/

	}

}