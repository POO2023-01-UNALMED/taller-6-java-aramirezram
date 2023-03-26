package vehiculos;

import java.util.HashMap;

public class Fabricante {
	public String nombre;
	public static int maxi=0;
	public static String fabrimasven;
	public static Fabricante fabmayor;
	public static HashMap<Fabricante, Integer> fabricas= new HashMap<>();
	public Pais pais;
	
	public Fabricante(String nombre, Pais pais){
		this.nombre=nombre;
		this.pais=pais;
		Pais.contarpaises(pais.getNombre());
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public Pais getPais() {
		return this.pais;
	}
	public void setPais(Pais pais) {
		this.pais=pais;
	}
	
	public static void contarpaises(Fabricante fabricante) {
		if(fabricas.containsKey(fabricante)) {
			int sumara;
			sumara=(int) fabricas.get(fabricante);
			fabricas.put(fabricante, ++sumara);
		}
		else {
			fabricas.put(fabricante, 1);
		}
		if(fabricas.get(fabricante)>maxi) {
			maxi=fabricas.get(fabricante);
			fabmayor=fabricante;
			}
	}
	
	public static Fabricante fabricaMayorVentas() {
		return fabmayor;
	}
	

}
