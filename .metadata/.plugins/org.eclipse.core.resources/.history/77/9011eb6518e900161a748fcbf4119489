package Banco;

public class CuentaCredito extends Cuenta {

	 public CuentaCredito(String titular, double saldo) {
		super(titular, saldo);
		// TODO Auto-generated constructor stub
	}

	private static final double MAX_NEGATIVO=-100;
	private static final double INT_NEG=0.01;
	private double saldoNegativo;
	private double Interes;
	@Override
	public void reintegro(double cant) {
		
		if(saldo>=cant){
			saldo=saldo-cant;
		}else {
			saldoNegativo=saldo-cant;
			Interes=saldoNegativo*INT_NEG;
				if(MAX_NEGATIVO<=saldoNegativo+Interes){
					saldo=saldoNegativo+Interes;
				}else{
					System.out.println("ERROR! No puede sacar dinero!");
				}
		}
	}
	

}
