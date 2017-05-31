package datos;

public class Contacto {
	private String nom;
	private String tlfno;
	private int edad;
	
	
	// constructor
	public Contacto() {
	}

	// getters and setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTlfno() {
		return tlfno;
	}

	public void setTlfno(String tlfno) {
		this.tlfno = tlfno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// ToString
	@Override
	public String toString() {
		return "Contacto [nom=" + nom + ", tlfno=" + tlfno + ", edad=" + edad + "]";
	}
	
}
