package vehiculos;


public class Fabricante {
	String nombre;
	Pais pais; 
	
	public Fabricante(String nombre, Pais pais){
		this.nombre = nombre;
		this.pais = pais;
	}

	void setNombre(String nombre) {this.nombre = nombre;}
	String getNombre() {return nombre;}
	
	void setPais(Pais pais) {this.pais = pais;}
	Pais getPais() {return pais;}
	
	static String fabricaMayorVentas() {
		return "";
	}
}
