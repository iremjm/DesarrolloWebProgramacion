
import com.aeat.valida.Validador;
		 
		public class DNI {
		    public static void main(String[] args) {
		 
		        String input = "000000000";
		        Validador validador = new Validador();
		        int e = validador.checkNif(input);
		 
		        if (e > 0)
		            System.out.println("OK");
		        else
		            System.out.println("MAL");
		 
		    }
		

	}


