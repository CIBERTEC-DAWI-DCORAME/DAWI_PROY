package model;

public class Provincia {
	
	private Integer idProvincia;
	private Integer idDepartamento;
	private String nombre;

	public Provincia() {
		
	}

	public Integer getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(Integer idProvincia) {
		this.idProvincia = idProvincia;
	}

	public Integer getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ProvinciaDTO [idProvincia=" + idProvincia + ", idDepartamento=" + idDepartamento + ", nombre=" + nombre
				+ "]";
	}
	
}
