package model;

public class Estado {
	
	private Integer idEstado;
	private String nombre;

	public Estado() {

	}

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "EstadoDTO [idEstado=" + idEstado + ", nombre=" + nombre + "]";
	}

}
