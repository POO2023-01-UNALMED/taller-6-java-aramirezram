package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	Camion(String placa,String nombre,int precio,int peso,Fabricante fabricante,int ejes){
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
		this.ejes=ejes;
	}
	protected int getEjes(){
		return this.ejes;
	}
	protected void setEjes(int eje) {
		this.ejes=eje;
	}
}