package Banco;

public class programa {

	public static void main(String[] args) {
		CuentaCredito c1= new CuentaCredito("-->juan", 888);
		CuentaNomina c2= new CuentaNomina("--> peter", 400);
		
		c1.reintegro(10);
	
		System.out.println(c1.getTitular()+ " Su saldo actual "+c1.getSaldo());
		
		System.out.println("------------------------------");
		c2.reintegro(500);
	
		System.out.println(c2.getTitular()+ " Su saldo actual "+c2.getSaldo());
		
	}

}