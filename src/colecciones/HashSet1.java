package colecciones;

import java.util.HashSet;

public class HashSet1 {
	
	
	private String nombre;
	private String especie;
	
	

	public HashSet1(String nombre, String especie) {
		super();
		this.nombre = nombre;
		this.especie = especie;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getEspecie() {
		return especie;
	}



	public void setEspecie(String especie) {
		this.especie = especie;
	}



	@Override
	public String toString() {
		return "nombre=" + nombre + ", especie=" + especie + "";
	}


	//Si no se sobrescribe equal y hashcode, HashSet falla

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((especie == null) ? 0 : especie.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashSet1 other = (HashSet1) obj;
		if (especie == null) {
			if (other.especie != null)
				return false;
		} else if (!especie.equals(other.especie))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	


}
