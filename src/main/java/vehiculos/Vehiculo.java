package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
	String placa;
	int puertas;
	float velocidadMaxima;
	String nombre;
	float precio;
	double peso;
	String traccion;
	Fabricante fabricante;
	static int CantidadVehiculos, cantidadAutomoviles, cantidadCamiones, cantidadCamionetas;
	
	static ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
		
	
	public Vehiculo(String placa, int puertas, float velocidadMaxima, String nombre, float precio, double peso,
			String traccion, Fabricante fabricante){
		
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		CantidadVehiculos++;
		listaVehiculos.add(this);
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: " + String.valueOf(cantidadAutomoviles)+"\nCamionetas: "+String.valueOf(cantidadCamionetas)+"\nCamiones: " + String.valueOf(cantidadCamiones);
	}

	public static String paisMasVendedor() {
		return "";
		}
		
	public static String fabricaMayorVentas() {
		return "";
		}
	
	public static void setCantidadVehiculos(int cantidad) {
		CantidadVehiculos = cantidad;
	}
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	public void setPlaca(String p) {placa = p;}
	public String getPlaca() {return placa;}
	
	public void setPuertas(int p) {puertas = p;}
	public int getPuertas() {return puertas;}
	
	public void setVelocidadMaxima(float v) {velocidadMaxima = v;}
	public float getVelocidadMaxima() {return velocidadMaxima;}
	
	public void setNombre(String n) {nombre = n;}
	public String getNombre() {return nombre;}
	
	public void setPrecio(float p) {precio = p;}
	public float getPrecio() {return precio;}
	
	public void setPeso(double p) {peso = p;}
	public double getPeso() {return peso;}
	
	public void setTraccion(String t) {traccion = t;}
	public String getTraccion() {return traccion;}
	
	public void setFabricante(Fabricante f) {fabricante = f;}
	public Fabricante getFabricante() {return fabricante;}
	
}
	

