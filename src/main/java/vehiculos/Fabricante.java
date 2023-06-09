package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
	String nombre;
	Pais pais; 
	
	public Fabricante(String nombre, Pais pais){
		this.nombre = nombre;
		this.pais = pais;
	}

	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getNombre() {return nombre;}
	
	
	
	public void setPais(Pais pais) {this.pais = pais;}
	public Pais getPais() {return pais;}
	
	public static Fabricante fabricaMayorVentas() {
		int cantidadVentas = 0;
		String fabrcanteMayorVentas = "";
		Fabricante fabricanteMayor = new Fabricante("", new Pais(""));
		ArrayList<String> nombreFabricante = new ArrayList<String>();
		
		
		for(Vehiculo vehiculo : Vehiculo.listaVehiculos ) {
			nombreFabricante.add(vehiculo.fabricante.getNombre());
		}
		for(String nombre : nombreFabricante) {
			if (cantidadVentas < Collections.frequency(nombreFabricante, nombre)) {
				cantidadVentas = Collections.frequency(nombreFabricante, nombre);
				fabrcanteMayorVentas = nombre;
			}
		}
		for(Vehiculo vehiculo : Vehiculo.listaVehiculos) {
			
			if(fabrcanteMayorVentas == vehiculo.fabricante.getNombre()){
				fabricanteMayor = vehiculo.fabricante;
				break;
			}
		}
		return fabricanteMayor;
	}
}

