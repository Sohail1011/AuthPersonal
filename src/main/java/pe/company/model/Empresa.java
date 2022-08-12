package pe.company.model;

public class Empresa {

	private int id_empresa;
	private String nombre;
	private String pais;

	public Empresa() {
	}

	public Empresa(int id_empresa, String nombre, String pais) {
		this.id_empresa = id_empresa;
		this.nombre = nombre;
		this.pais = pais;
	}

	public int getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}