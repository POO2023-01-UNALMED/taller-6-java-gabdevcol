package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Vehiculo {
	String placa;
	int puertas;
	float velocidadMaxima;
	String nombre;
	float precio;
	double peso;
	String traccion;
	Fabricante fabricante;
	static int CantidadVehiculos, cAutomovil, cCamion, cCamioneta;
	static ArrayList<String> listaPaises = new ArrayList<String>();
	static ArrayList<String> listaFabricantes = new ArrayList<String>();
	
	
	Vehiculo(String placa, int puertas, float velocidadMaxima, String nombre, float precio, double peso,
			String traccion, Fabricante fabricante){
		
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		actualizarListaPaises(fabricante);
		CantidadVehiculos++;
	}
	
	String vehiculosPorTipo() {
		return "Automoviles: " + String.valueOf(cAutomovil)+"/n"+"Camionetas: "+String.valueOf(cCamioneta)+"/n"+"Camiones: " + String.valueOf(cCamion);
	}
	void actualizarListaPaises(Fabricante fabricante) {
			listaPaises.add(fabricante.pais.nombre);
			}
	void actualizarListaFabricantes(Fabricante fabricante) {
		listaFabricantes.add(fabricante.nombre);
		}

	String paisMasVendedor() {
		int cantidadVentas = 0;
		String paisMasVendedor = "";
		for(String pais : listaPaises) {
			if (cantidadVentas < Collections.frequency(listaPaises, pais)) {
				paisMasVendedor = pais;
			}
		}
		return paisMasVendedor;
	}
	String fabricanteMasVendedor() {
		int cantidadVentas = 0;
		String fabricanteMasVendedor = "";
		for(String fabricante : listaFabricantes) {
			if (cantidadVentas < Collections.frequency(listaFabricantes, fabricante)) {
				fabricanteMasVendedor = fabricante;
			}
		}
		return fabricanteMasVendedor;
	}
	static void setCantidadVehiculos(int cantidad) {
		CantidadVehiculos = cantidad;
	}
	static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
}
