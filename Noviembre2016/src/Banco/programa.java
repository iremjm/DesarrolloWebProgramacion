package Banco;

public class programa {

	public static void main(String[] args) {
		CuentaCredito c1= new CuentaCredito("juan", 888);
		c1.reintegro(2);
		System.out.println(c1.getSaldo());

	}

}
