package model;

public class Puesto {
	
	private Integer idPuesto;
	private String nombre;

	public Puesto() {

	}

	public Integer getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(Integer idPuesto) {
		this.idPuesto = idPuesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "PuestoDTO [idPuesto=" + idPuesto + ", nombre=" + nombre + "]";
	}

}
