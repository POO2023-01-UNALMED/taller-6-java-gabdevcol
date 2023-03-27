package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Pais {
	String nombre;
	
	public Pais(String nombre){
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getNombre() {return nombre;}
	
	public static String paisMasVendedor() {
		int cantidadVentas = 0;
		String paisMayorVentas = "";
		ArrayList<String> nombrePais = new ArrayList<String>();
		
		
		for(Vehiculo vehiculo : Vehiculo.listaVehiculos ) {
			nombrePais.add(vehiculo.fabricante.pais.getNombre());
		}
		for(String nombre : nombrePais) {
			if (cantidadVentas < Collections.frequency(nombrePais, nombre)) {
				cantidadVentas = Collections.frequency(nombrePais, nombre);
				paisMayorVentas = nombre;
			}
		}
		return paisMayorVentas;
	}
}
