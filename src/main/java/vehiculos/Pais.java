package vehiculos;

public final class Pais {
	String nombre;
	
	Pais(String nombre){
		this.nombre = nombre;
	}
	
	void setNombre(String nombre) {this.nombre = nombre;}
	String getNombre() {return nombre;}
	
	static String paisMasVendedor() {
		return "";
	}
}
