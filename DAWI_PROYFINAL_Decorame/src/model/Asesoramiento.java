package model;

public class Asesoramiento {
	
	private Integer idAsesoramiento;
	private String nombre;
	private Double precio;

	public Asesoramiento() {

	}

	public Integer getIdAsesoramiento() {
		return idAsesoramiento;
	}

	public void setIdAsesoramiento(Integer idAsesoramiento) {
		this.idAsesoramiento = idAsesoramiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "AsesoramientoDTO [idAsesoramiento=" + idAsesoramiento + ", nombre=" + nombre + ", precio=" + precio
				+ "]";
	}

}
