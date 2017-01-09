/*3 Crear el programa, utilizando la tÃ©cnica de programaciÃ³n estructurada, para un determinado
comercio en el que se realiza un descuento dependiendo del precio de cada producto. Si el
precio es inferior a 6 euros, no se hace descuento; si es mayor o igual a 6 euros y menor que 60
euros, se hace un 5 por 100 de descuento, y si es mayor o igual a 60 euros, se hace un 10 por
100 de descuento. Finalizar visualizando el precio inicial, el valor del descuento y el precio final.
Nota: Puedes utilizar las siguientes funciones:
â—� leerPrecio: QuÃ© lee un precio y valida que sea positivo.
â—� calcularDescuento: Que recibe un precio y devuelve el descuento.
â—� CalcularPrecioTotal: Que recibe un precio y y el descuento y devuelve el precio final.*/
package MetodosDiciembre.Ejer3;
import static java.lang.Math.*;
public class ImporteTienda {

	double precio;
	//datos de las compras precios, descuentos 
	final int TIPO_DESCUENTO_MEN=6;
	final int TIPO_DESCUENTO_MAY=60;
	//porcentajes de descuento
	final double DESCUENTO_NORMAL=0.05;
	final double DESCUENTO_SUPER=0.1;
	//totales
	double descuento;
	double total;
	
	//Metodo constructor
	public double ImporteTienda(){
		return(precio);
	}
	
	
	public void ComprobarPrecioMayor6(){
		if(precio >= TIPO_DESCUENTO_MEN && precio<TIPO_DESCUENTO_MAY){
			descuento=precio*DESCUENTO_NORMAL;
			total=precio-descuento;
		}
		else if(precio >=TIPO_DESCUENTO_MAY){
			descuento=precio*DESCUENTO_SUPER;
			total=precio-descuento;
		}
		
	}
	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public void LeerResultado(){
		if(precio>=6){
			System.out.println("Precio del producto: " + 
			precio + "â‚¬" +" El descuento es de "+ descuento + "â‚¬ y el total es de "+ total +"â‚¬");
		}
		else{
			System.out.printf("Precio del producto: " + "%.2f",precio);
			System.out.printf("%d %,5.3f \n",2 ,precio );
		}
		
	}
}
