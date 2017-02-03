package Banco;

public class CuentaNomina extends Cuenta {
	
	
	public CuentaNomina(String titular, double nomina) {
		super(titular, nomina);
		// TODO Auto-generated constructor stub
	}
	private final double NOMINA=1000;
	private double saldoNegativo;
	@Override
	public void reintegro(double cant) {
		
		if(saldo>=cant){
			saldo=saldo-cant;
		}else {
			saldoNegativo=saldo-cant;
				if(saldoNegativo>=(-NOMINA)){
					saldo=saldoNegativo;
				}else{
					System.out.print("ERROR! No puede sacar dinero!");
				}
		}
	}	


}
