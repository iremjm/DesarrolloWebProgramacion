package Banco;

public  class CuentaNomina extends Cuenta{
	private final double NOMINA=1000; 
	private  double saldoNegativo;
	public CuentaNomina(String titular, double saldo) {
		super(titular, saldo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void reintegro(double cant) {
		if (saldo >= cant){
			saldo=saldo-cant;
		}else{
			saldoNegativo=saldo-cant;
			if(saldoNegativo<=(-NOMINA)){
				saldo=saldoNegativo;
				System.out.println("Su cuenta est� en negativo, se le descontar� de la pr�xima n�mina");
			}else{
				System.out.print("Opereaci�n rechazada por la entidad.");
			}
		}
	}
}