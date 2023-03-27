package vehiculos;

public class Pais {
	String nombre;
	
	public Pais(String nombre){
		this.nombre = nombre;
	}
	
	void setNombre(String nombre) {this.nombre = nombre;}
	String getNombre() {return nombre;}
	
	static String paisMasVendedor() {
		return "";
	}
}
