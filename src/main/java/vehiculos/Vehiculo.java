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
	
	static String vehiculosPorTipo() {
		return "Automoviles: " + String.valueOf(cAutomovil)+"\nCamionetas: "+String.valueOf(cCamioneta)+"\nCamiones: " + String.valueOf(cCamion);
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
	void setPlaca(String p) {placa = p;}
	String getPlaca() {return placa;}
	
	void setPuertas(int p) {puertas = p;}
	int getPuertas() {return puertas;}
	
	void setVelocidadMaxima(float v) {velocidadMaxima = v;}
	float getVelocidadMaxima() {return velocidadMaxima;}
	
	void setNombre(String n) {nombre = n;}
	String getNombre() {return nombre;}
	
	void setPrecio(float p) {precio = p;}
	float getPrecio() {return precio;}
	
	void setPeso(double p) {peso = p;}
	double getPeso() {return peso;}
	
	void setTraccion(String t) {traccion = t;}
	String getTraccion() {return traccion;}
	
	void setFabricante(Fabricante f) {fabricante = f;}
	Fabricante getFabricante() {return fabricante;}
	
}
	

