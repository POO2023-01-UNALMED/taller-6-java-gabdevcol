package vehiculos;

public class Camion extends Vehiculo{
	int ejes;
	
	Camion(String placa, String nombre, float precio, double peso,
			Fabricante fabricante, int ejes){
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
		this.ejes = ejes;
		cCamion++;
	}
	
	void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	int getEjes() {
		return ejes;
	}
}
