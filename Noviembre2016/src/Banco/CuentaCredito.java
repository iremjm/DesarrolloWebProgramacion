package Banco;

public class CuentaCredito extends Cuenta {

	public CuentaCredito(String titular, double saldo) {
		super(titular, saldo);
		// TODO Auto-generated constructor stub
	
	}
	private static final double MAX_NEGATIVO=-400;
	private static  double interes;
	private static final double INT_NEG =0.01;
	private  double saldoNegativo;
	@Override
	public void reintegro(double cant) {
		if (saldo >= cant){
			saldo=saldo-cant;
		}else{
			saldoNegativo=saldo-cant;
			interes=saldoNegativo*INT_NEG;
			if(MAX_NEGATIVO<=saldoNegativo+interes){
				saldo=saldoNegativo+interes;
				System.out.println("Su cuenta est� en negativo");
			}else{
				System.out.print("Opereaci�n rechazada por la entidad.");
			}
		}
		
	}

}