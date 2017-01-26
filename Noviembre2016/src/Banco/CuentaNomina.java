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
				System.out.println("Su cuenta está en negativo, se le descontará de la próxima nómina");
			}else{
				System.out.print("Opereación rechazada por la entidad.");
			}
		}
	}
}
