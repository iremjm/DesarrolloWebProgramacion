package Banco;

public abstract class Cuenta {
	protected String titular;
	protected double saldo;
	
	//Constructoras
	public Cuenta(String titular, double saldo){
		this.titular=titular;
		this.saldo=saldo;		
	}
	public abstract void reintegro(double cant);
	
	public void ingreso(double cant){
		this.saldo=saldo-cant;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cuenta= \nTitular: "+titular+"\nSaldo: "+saldo;
	}
	//getters and setters
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
