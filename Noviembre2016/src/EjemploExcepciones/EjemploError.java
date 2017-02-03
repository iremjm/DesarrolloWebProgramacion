
public class EjemploError {
private void metodo1(){
	metodo2();
}
private void metodo2() throws ArithmeticException{
		int num=5/0;
		metodo1();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjemploError ee=null;
		String nombre="2";
		try{
		int edad=Integer.parseInt(nombre);		
			ee.metodo1();
		}catch(NullPointerException e){
			ee=new EjemploError();
			try{
			ee.metodo2();
			}catch(NumberFormatException nfe){
				System.out.println("Debe ser numerico!");
			}catch(ArithmeticException ae){
				System.out.println("division por cero");
			}
		}
	}
}
