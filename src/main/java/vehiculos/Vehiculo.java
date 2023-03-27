package vehiculos;


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
		CantidadVehiculos++;
	}
	
	static String vehiculosPorTipo() {
		return "Automoviles: " + String.valueOf(cantidadAutomoviles)+"\nCamionetas: "+String.valueOf(cantidadCamionetas)+"\nCamiones: " + String.valueOf(cantidadCamiones);
	}

	static String paisMasVendedor() {
		return "";
		}
		
	static String fabricaMayorVentas() {
		return "";
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
	

