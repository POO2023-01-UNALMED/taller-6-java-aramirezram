package vehiculos;

import java.util.HashMap;

public class Pais {
	public String nombre;
	public static int maxi=0;
	public static String paismasven;
	public static HashMap<String, Integer> paises= new HashMap<>();
	public Pais(String nombre){
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public static void contarpaises(String pais) {
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
	public static Pais paisMasVendedor() {
		return new Pais(paismasven);
	}

}
