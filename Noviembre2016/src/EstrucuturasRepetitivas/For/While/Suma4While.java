package EstrucuturasRepetitivas.For.While;
//Pide al usuario 4 n�meros  y muestra su suma utilizando la estructura while
import javax.swing.JOptionPane;

public class Suma4While {

	public static void main(String[] args) {
		int suma=0;
		int contador=0;
		while(contador<4){
			contador++;
		 String num= JOptionPane.showInputDialog("Introduce un n�mero, por favor");
		int numero=Integer.parseInt(num);
		 suma+=numero;
		}//while
		JOptionPane.showMessageDialog( null,"El resultado es " + suma +".\n"+ "Sigue sumando.");		 
	}

}
