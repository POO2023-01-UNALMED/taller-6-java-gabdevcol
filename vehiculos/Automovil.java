package vehiculos;

public class Automovil extends Vehiculo{
	int puestos;
	
	
	Automovil(String placa, String nombre, float precio, double peso,
			 Fabricante fabricante, int puestos){
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos = puestos;
		cAutomovil++;
	}
	
	void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	int getPuestos() {
		return puestos;
	}
}