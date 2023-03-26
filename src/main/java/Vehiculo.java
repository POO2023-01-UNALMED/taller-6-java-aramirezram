package vehiculos;


public class Vehiculo {
	protected String placa,nombre,traccion;
	protected int puertas,precio,peso,velocidadMaxima;
	static int CantidadVehiculos;
	private Fabricante fabricante;
	static private int automoviles,camionetas,camiones;
	
	Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante fabricante){
		if(this.getClass().getName()=="vehiculos.Camion") camiones++;
		if(this.getClass().getName()=="vehiculos.Camioneta") camionetas++;
		if(this.getClass().getName()=="vehiculos.Automóvil") automoviles++;
		CantidadVehiculos++;
		Fabricante.contarpaises(fabricante);
		this.placa=placa;
		this.puertas=puertas;
		this.velocidadMaxima=velocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		
	}
	void vehiculosPorTipo() {
		System.out.printf("Automoviles:%d%nCamionetas:%d%nCamiones:%d",automoviles,camionetas,camiones);
	}
	protected int getPuertas(){
		return this.puertas;
	}
	protected void setPuertas(int puertas) {
		this.puertas=puertas;
	}
	protected int getPrecio(){
		return this.precio;
	}
	protected void setPrecio(int precio) {
		this.precio=precio;
	}
	protected int getPeso(){
		return this.peso;
	}
	protected void setPeso(int peso) {
		this.peso=peso;
	}
	protected static int getCantidadVehiculos(){
		return CantidadVehiculos;
	}
	protected static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos=cantidadVehiculos;
	}
	protected int getVelocidadMaxima(){
		return this.velocidadMaxima;
	}
	protected void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima=velocidadMaxima;
	}
	protected String getPlaca(){
		return this.placa;
	}
	protected void setEjes(String placa) {
		this.placa=placa;
	}
	protected String getNombre(){
		return this.nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre=nombre;
	}
	protected String getTraccion(){
		return this.traccion;
	}
	protected void setTraccion(String traccion) {
		this.traccion=traccion;
	}
	protected Fabricante getFabricante(){
		return this.fabricante;
	}
	protected void setFabricante(Fabricante fabricante) {
		this.fabricante=fabricante;
	}
	

}
