package vehiculos;

public static class Fabricante {
	String nombre;
	Pais pais; 
	
	Fabricante(String nombre, Pais pais){
		this.nombre = nombre;
		this.pais = pais;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	String getNombre() {
		return nombre;
	}
	
	void setPais(Pais pais) {
		this.pais = pais;
	}
	
	Pais getPais() {
		return pais;
	}
}
