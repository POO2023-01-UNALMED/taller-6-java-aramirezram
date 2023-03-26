package vehiculos;

public class Camioneta extends Vehiculo {
	boolean volco;
	Camioneta(String placa,int puertas,String nombre,int precio,int peso,Fabricante fabricante,boolean volco){
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
	}
	protected boolean isVolco(){
		return this.volco;
	}
	protected void setVolco(boolean volco) {
		this.volco=volco;
	}
}
