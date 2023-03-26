package vehiculos;


public class Vehiculo {
	public String placa,nombre,traccion;
	public int puertas,precio,peso,velocidadMaxima;
	public static int CantidadVehiculos;
	public Fabricante fabricante;
	static public int automoviles,camionetas,camiones;
	
	public Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante fabricante){
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
	public void vehiculosPorTipo() {
		System.out.printf("Automoviles:%d%nCamionetas:%d%nCamiones:%d",automoviles,camionetas,camiones);
	}
	public int getPuertas(){
		return this.puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas=puertas;
	}
	public int getPrecio(){
		return this.precio;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public int getPeso(){
		return this.peso;
	}
	public void setPeso(int peso) {
		this.peso=peso;
	}
	public static int getCantidadVehiculos(){
		return CantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos=cantidadVehiculos;
	}
	public int getVelocidadMaxima(){
		return this.velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima=velocidadMaxima;
	}
	public String getPlaca(){
		return this.placa;
	}
	public void setEjes(String placa) {
		this.placa=placa;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getTraccion(){
		return this.traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion=traccion;
	}
	public Fabricante getFabricante(){
		return this.fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante=fabricante;
	}
	

}
