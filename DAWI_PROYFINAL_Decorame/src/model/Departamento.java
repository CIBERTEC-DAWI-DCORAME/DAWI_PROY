package model;

public class Departamento {
	
	private Integer idDepartamento;
	private String nombre;
	
	public Departamento() {
		
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
		return "DepartamentoDTO [idDepartamento=" + idDepartamento + ", nombre=" + nombre + "]";
	}

}
