import java.util.Scanner;

/*Realizar un programa que pregunte al usuario el momento del d�a con una letra
(m-ma�ana, t-tarde, n-noche), el sexo con otra letra (m-masculino, f-femenino). El
programa dir�: buenos d�as, tardes, o noches (seg�n el momento) se�or o se�ora
seg�n el sexo.*/
public class Ejerc5 {

	public static void main(String[] args) {
		String momDia;
		String sexo;
		Scanner tc=new Scanner(System.in);
		System.out.println("�En que momento del d�a se encuentra?\n ->ma�ana \n ->tarde \n ->noche");
		momDia=tc.nextLine();
		System.out.println("�Su sexo es \n ->masculino \n ->femenino");
		sexo=tc.nextLine();
		if(momDia.toLowerCase().equals("ma�ana")){
			momDia="d�a";
	    }
		if(sexo.equals("femenino")){
			System.out.print("Buenas " + momDia.toLowerCase()+"s"+ " se�ora.");
		}else{
			System.out.print("Buenas " + momDia.toLowerCase()+"s" + " se�or.");
		 } 
	}

}
