/*Ejercicios OOP- Punto
Implementación y pruebas de la clase Punto.****
- Crea el paquete geometria y añade la clase Punto . Esta clase representa un punto en
el plano XY de los números enteros.
- Las propiedades que caracterizan a un punto son las coordenadas x e y. Estas
propiedades se pueden consultar y modificar(getter y setter).

- Los objetos de la clase Punto pueden ser construidos de tres modos:
● Constructor con dos argumentos: inicializa las coordenadas del objeto punto a partir
de los parámetros x e y.
● Constructor sin argumentos: inicializa el punto en el origen de coordenadas (0,
0).Por tanto, este constructor no tiene ningún parámetro.
● Constructor de copia: establece las coordenadas del punto a partir de las
coordenadas de otra posición. Así pues, el parámetro de este constructor es otro
objeto posición.

La funcionalidad(métodos) que ofrece esta clase es la siguiente:
- desplazar un incremento en x y un incremento en y. Esta función modifica los
valores de las coordenadas x e y sumando las cantidades que se especifican como
parámetros.
Define la clase PruebaPunto que incluya un método main en el paquete pruebas . El
código del programa debe estar documentado con comentarios que expliquen los pasos
que se van realizando.

● Declara la variable local punto1 y asigna un objeto Punto en las coordenadas
(1, 3). Muestra el valor de las propiedades x e y por la consola.
● Declara la variable punto2 y asigna un objeto Punto construido a partir del
constructor sin parámetros. Muestra por la consola el valor de sus propiedades.
● Declara la variable punto3 y asigna un objeto Punto construido a partir del punto1
(constructor de copia). Muestra sus propiedades por la consola.
● Declara la variable punto4 y asígnale la variable punto2.
● Modifica las coordenadas de punto2 y muestra el valor de las propiedades por la
consola. Muestra también el valor de las propiedades del punto4. Observa que tienen
los mismos valores porque son referencias al mismo objeto.*/
package Geometria.Punto;
		
public class Punto {
	private int x;
	private int y;
	
	
	public Punto(){	
		this.x=0;
		this.y=0;
	}
	
	public Punto(int x,int y){
		this.x=x;
		this.y=y;
	}
	public Punto(Punto p){
		this.x=p.x;
		this.y=p.y;
	}
	/*//Si le da un valor a la constructora
	public Punto(int posicionIniX,int PosicionIniY){
		
	}*/
	//Métodos getter & setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//metodos de la clase
	public void DesplazarX(int DespX){
		this.x+=DespX;
		
	}
	public void DesplazarY(int DespY){
		this.y+=DespY;
	}
	
		 
}
	
