package vehiculos;

import java.util.HashMap;

public class Pais {
	private String nombre;
	static int maxi=0;
	static String paismasven;
	static HashMap<String, Integer> paises= new HashMap<>();
	Pais(String nombre){
		this.nombre=nombre;
	}
	
	String getNombre() {
		return this.nombre;
	}
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	static void contarpaises(String pais) {
		if(paises.containsKey(pais)) {
			int sumara;
			sumara=(int) paises.get(pais);
			paises.put(pais, ++sumara);
		}
		else {
			paises.put(pais, 1);
		}
		if(paises.get(pais)>maxi) {
			maxi=paises.get(pais);
			paismasven=pais;
			}
	}
	static Pais paisMasVendedor() {
		return new Pais(paismasven);
	}

}
