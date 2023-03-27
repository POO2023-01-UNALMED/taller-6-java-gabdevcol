package vehiculos;

public class Camioneta extends Vehiculo{
	boolean volco;
	
	Camioneta(String placa, int puertas, String nombre, float precio, double peso,
			 Fabricante fabricante, boolean volco){
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		cantidadCamionetas++;
	}
		
	void setVolco(boolean volco){
		this.volco = volco;
	}
	
	boolean isVolco() {
		return volco;
	}
}
