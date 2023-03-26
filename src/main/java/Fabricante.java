package vehiculos;

import java.util.HashMap;

public class Fabricante {
	private String nombre;
	static int maxi=0;
	static String fabrimasven;
	static Fabricante fabmayor;
	static HashMap<Fabricante, Integer> fabricas= new HashMap<>();
	Pais pais;
	
	Fabricante(String nombre, Pais pais){
		this.nombre=nombre;
		this.pais=pais;
		Pais.contarpaises(pais.getNombre());
	}
	String getNombre() {
		return this.nombre;
	}
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	Pais getPais() {
		return this.pais;
	}
	void setPais(Pais pais) {
		this.pais=pais;
	}
	
	static void contarpaises(Fabricante fabricante) {
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
	
	static Fabricante fabricaMayorVentas() {
		return fabmayor;
	}
	

}
