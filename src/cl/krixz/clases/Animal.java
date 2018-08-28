package cl.krixz.clases;

public abstract class Animal {
	
	// NO podemos tener una instancia de esta clase, es un PROPTOTIPO!!!!

	private String nombre;
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void alimentarse();	// Clase abstracta tiene métodos abstractos
										// Sólo pueden ser implementados por las clases hijas
	
	public void moverse() {
		System.out.println("El animal se está moviendo");
	}
}
