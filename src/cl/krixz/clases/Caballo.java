package cl.krixz.clases;

public class Caballo extends Animal {

	private String raza;	// nueva propiedad, se diferencia de clase padre
	
	public Caballo(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	// como es un método abstracto, este método DEBE implementarse en clase hija
	@Override
	public void alimentarse() {
		
		System.out.println("Me alimento de hierbas");
		
	}
}
