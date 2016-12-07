import processing.core.PApplet;

public class Processing1 extends PApplet{
	private int rad = 30;//Ancho de la forma 
	private float xpos, ypos;// Posici�n de la forma a partir BOLA
	private float xPosPala, yPosPala;// Posici�n de la forma a partir PALA
	private float xvelocidad = 2.8f;// Velocidad de la forma BOLA 
	private float yvelocidad =2.2f;// Velocidad de la forma BOLA
	private int xdireccion = 1;// Izquierda o derecha BOLA 
	private int ydireccion = 1;// De arriba a abajo BOLA

	public static void main(String[] args) {
			PApplet.main("Processing1");
		
	}
	  public void settings(){
	        size(400,400);//tama�o del lienzo
	    }

	    public void setup(){//inicia
	        fill(1,50,240);//color bola
	        noStroke();
	        frameRate(30);
	        ellipseMode(RADIUS);
	        // Establecer la posici�n inicial de la forma 
	        xpos = width/2;
	        ypos = height/2;
	        
	    }//setup
	    
	    public void draw(){
  
	        background(255);//fondo lienzo
	
	        xpos = xpos + ( xvelocidad * xdireccion );
	        ypos = ypos + ( yvelocidad * ydireccion );
	        //PAREDES
	        // Prueba para ver si la forma supera los l�mites de la pantalla 
	        // Si no lo hace, invertir su direcci�n de multiplicar por -1
	        if (xpos > width-rad || xpos < rad) {
	          xdireccion *= -1;
	        }
	        if (ypos > height-rad || ypos < rad) {
	          ydireccion *= -1;
	        }
	        //dibujar la bola
	        ellipse(xpos, ypos, rad, rad);
	        //dibujar rectangulo
	        rect(200, 350, 100, 30,10);
	    }//draw
	    
	    
}