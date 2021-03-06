
import processing.core.PApplet;

public class Processing1 extends PApplet{
	//bola/////////////////////////////////////////////////
	private int rad = 20;//Ancho de la forma 
	private float xpos, ypos;// Posici�n de la forma BOLA
	private float xvelocidad = 2.8f;// Velocidad de la forma BOLA 
	private float yvelocidad =2.2f;// Velocidad de la forma BOLA
	private int xdireccion = 1;// Izquierda o derecha BOLA 
	private int ydireccion = 1;// De arriba a abajo BOLA
	//pala////////////////////////////////////////////////
	private int x,y;//Posici�n de la pala
	private int largo;
	private int xpdireccion=1;
	private float xPosPala, yPosPala;// Posici�n de la forma a partir PALA
	
	public static void main(String[] args) {
			PApplet.main("Processing1");
		
	}
	  public void settings(){
	        size(400,400);//tama�o del lienzo
	    }

	    public void setup(){//inicia
	        fill(1,50,240);//color bola
	        noStroke();
	        frameRate(300);
	        ellipseMode(RADIUS);
	        // Establecer la posici�n inicial de la forma 
	        xpos = width/2;
	        ypos = height/2;
	        //establecer la posicion inicial de la pala en el centro
	        x=width/2-50;
	        y=height-50;
	        
	    }//setup
	    
	    public void draw(){
  
	        background(255);//fondo lienzo
	        //bola//////////////////////////////////
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
	        //pala//////////////////////////////////
	        //dibujar rectangulo
	        rect(x,y,100,20);
	        //Direcciones izquierda o derecha
	        if(keyPressed && key == CODED){
	        	if(keyCode == LEFT){
	        		//si todav�a no ha llegado a la pared izda, puede ir a la izda
	        		if(x>0){
	        			x=x-10;
	        		}	
	        	}else if(keyCode == RIGHT){
	        		//si todav�a no ha llegado a la pared derecha, puede ir a la derecha
	        		if(x<300){
	        		x=x+10;
	        		}
	        	}
	        }
	        //bola choque pala
	        if((ypos+20>=y)&&(xpos+20>=x && (xpos-20<=x+100))){
	        	ydireccion *= -1;
	        }
	        //bola choque pared
	        if((x+400)<=0 ){
	        		x=x+10;
	        	if((x+400)>=width){
	        		x=x-10;
	        	}
	        }
	        //dibujar la bola
	        ellipse(xpos, ypos, rad, rad);       
	    }//draw
}
